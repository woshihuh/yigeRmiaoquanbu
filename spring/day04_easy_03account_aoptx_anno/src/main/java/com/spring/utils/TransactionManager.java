package com.spring.utils;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("txManager")
@Aspect
public class TransactionManager {

    @Autowired
    private ConnectionUtils connectionUtils;

    @Pointcut("execution(* com.spring.service.impl.*.*(..))")
    public  void pt1(){

    }

    public void beginTransaction(){
      try{
          connectionUtils.getThreadConnection().setAutoCommit(false);
      }catch (Exception e){
          e.printStackTrace();
      }
    }

    public void commit(){
        try{
            connectionUtils.getThreadConnection().commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void rollback(){
        try{
            connectionUtils.getThreadConnection().rollback();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void release(){
        try{
          connectionUtils.getThreadConnection().close();
          connectionUtils.removeConnection();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    @Around("pt1()")
    public Object aroundAdvice(ProceedingJoinPoint pjp){
        Object rtValue=null;
        try {
             Object[] args=pjp.getArgs();
             this.beginTransaction();
             rtValue=pjp.proceed(args);
             this.commit();
             return rtValue;
        }catch (Throwable t){
            this.rollback();
            throw  new RuntimeException(t);
        }finally {
            this.release();
        }
    }
}
