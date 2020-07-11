package com.spring.factory;

import com.spring.service.IAccountService;
import com.spring.utils.TransactionManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BeanFactory {
    private IAccountService accountService;
    private TransactionManager txManager;

    public void setTxManager(TransactionManager txManager) {
        this.txManager = txManager;
    }

    public final void setAccountService(IAccountService accountService) {
        this.accountService = accountService;
    }

    public IAccountService getAccountService(){
        return (IAccountService) Proxy.newProxyInstance(accountService.getClass().getClassLoader(), accountService.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object rtValue=null;
                try{
                    txManager.BeginTransaction();
                    rtValue=method.invoke(accountService,args);
                    txManager.commit();
                    return rtValue;
                }catch (Exception e){
                    txManager.rollback();
                    throw new RuntimeException(e);
                }finally {
                    txManager.release();
                }

            }

        });
    }
}
