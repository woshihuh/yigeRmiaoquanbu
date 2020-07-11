package com.spring.dao;

import com.spring.domain.Account;

public interface IAccountDao {
    public Account findAccountById(Integer accountid);

    public Account findAccountByName(String accountName);

    public void updateAccount(Account account);
}
