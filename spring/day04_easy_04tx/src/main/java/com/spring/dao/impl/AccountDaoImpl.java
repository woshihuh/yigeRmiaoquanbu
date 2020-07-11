package com.spring.dao.impl;

import com.spring.dao.IAccountDao;
import com.spring.dao.JdbcDaoSupport;
import com.spring.domain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountDao")
public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao  {


    public Account findAccountById(Integer accountId) {
         List<Account> list= super.getJdbcTemplate().query("select * from account where id=?",new BeanPropertyRowMapper<Account>(Account.class),accountId);
        System.out.println(list);
         return list.isEmpty()?null:list.get(0);
    }

    public Account findAccountByName(String accountName) {
         List<Account> list= super.getJdbcTemplate().query("select * from account where name=?",new BeanPropertyRowMapper<Account>(Account.class),accountName);
         if(list.isEmpty()){
             return null;
         }
         if(list.size()>1){
             throw new RuntimeException("结果集不唯一");
         }
         return list.get(0);
    }

    public void updateAccount(Account account) {
        super.getJdbcTemplate().update("update account set name=?,money=? where id=?",account.getName(),account.getMoney(),account.getId());
    }
}
