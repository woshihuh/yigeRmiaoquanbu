package com.spring.service;

import com.spring.domain.Account;

public interface IAccountService {
    Account findAccountById(Integer accountId);
    void transfer(String sourceName,String  targetName,Float money);
}
