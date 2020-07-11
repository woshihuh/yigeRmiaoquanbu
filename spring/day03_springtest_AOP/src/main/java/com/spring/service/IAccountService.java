package com.spring.service;

import com.spring.domain.Account;

import java.util.List;

public interface IAccountService {
    List<Account> findAllAccount();

    Account findAccountById(Integer accountId);

    void saveAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Integer accountId);

    void transfer(String sourceName,String targetName,Float money);
}
