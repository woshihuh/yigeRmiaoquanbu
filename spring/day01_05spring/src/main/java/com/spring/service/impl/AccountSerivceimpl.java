package com.spring.service.impl;

import com.spring.service.IAccountService;

import java.util.Date;

public class AccountSerivceimpl implements IAccountService {
    private String name;
    private Integer age;
    private Date brith;

    public AccountSerivceimpl(String name, Integer age, Date brith) {
        this.name = name;
        this.age = age;
        this.brith = brith;
    }

    public void saveAccount() {
        System.out.println(this.name+""+this.age+""+this.brith);
    }
}
