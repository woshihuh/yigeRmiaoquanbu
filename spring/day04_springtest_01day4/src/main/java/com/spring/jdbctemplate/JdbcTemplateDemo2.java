package com.spring.jdbctemplate;


import com.spring.dao.IAccountDao;
import com.spring.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcTemplateDemo2 {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        IAccountDao accountDao= (IAccountDao) ac.getBean("accountDao");
        Account account=accountDao.findAccountById(1);
        System.out.println(account.getName());
    }
}
