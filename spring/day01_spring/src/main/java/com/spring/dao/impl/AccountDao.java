package com.spring.dao.impl;

import com.spring.dao.IAccountDao;

public class AccountDao implements IAccountDao {
    public void saveAccount() {
        System.out.println("保存了账户");
    }
}
