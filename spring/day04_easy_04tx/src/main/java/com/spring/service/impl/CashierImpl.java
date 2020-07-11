package com.spring.service.impl;

import com.spring.dao.IAccountDao;
import com.spring.domain.Account;
import com.spring.service.Cashier;
import com.spring.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("cashier")
public class CashierImpl implements Cashier {
    @Autowired
    private IAccountService accountService;
    @Autowired
    private IAccountDao accountDao;

    public void checkOut(int testCount) {
        for (int i=0;i<testCount;i++){
            Account account=accountDao.findAccountByName("aaa");
            Float money = account.getMoney();
            if(money<=800){
                throw new RuntimeException("J8哦");
            }
            accountService.transfer("aaa","bbb",100f);
        }
    }

}
