package com.spring.dao.impl;

import com.spring.dao.IAccountDao;
import org.springframework.stereotype.Repository;

@Repository("accountDao1")
public class AccountDao implements IAccountDao {
    public void saveAccount() {
        System.out.println("保存了账户1111111");
    }
}
