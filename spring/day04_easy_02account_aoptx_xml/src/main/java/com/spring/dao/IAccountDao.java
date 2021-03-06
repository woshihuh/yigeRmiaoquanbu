package com.spring.dao;

import com.spring.domain.Account;

import java.io.Serializable;
import java.util.List;

public interface IAccountDao  {
    List<Account> findAllAccount();

    Account findAccountById(Integer accountId);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Integer accountId);

    Account findAccountByName(String accountName);
}
