package com.spring.service.impl;

import com.spring.dao.IAccountDao;
import com.spring.entities.Account;
import com.spring.service.IAccountService;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("accountService")
public class AccountServiceimpl implements IAccountService
{

   @Autowired
   private QueryRunner runner;
   List<Account> list=null;

    public void saveAccount() {
        try {
            list=runner.query("select * from account",new BeanListHandler<Account>(Account.class));
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        for(Account account:list){
            System.out.println(account.getMoney()+"=="+account.getMoney());
        }
    }
}
