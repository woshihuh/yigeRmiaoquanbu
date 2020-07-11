package com.spring;

import com.spring.config.SpringConfiguration;
import com.spring.domain.Account;
import com.spring.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AccountMain {
    public static void main(String[] args) {
        ApplicationContext ac=new AnnotationConfigApplicationContext(SpringConfiguration.class);
        IAccountService as= (IAccountService) ac.getBean("accountService");
        List<Account> list=as.findAllAccount();
        for(Account at:list)
        {
            System.out.println(at.getId()+"=="+at.getName()+"=="+at.getMoney());
        }
        Account account=new Account();
        account.setMoney(1000f);
        account.setName("傻逼");
        as.saveAccount(account);
    }
}
