package com.spring.service.impl;

import com.spring.service.IAccountService;

import java.util.Date;

public class AccountSerivceimpl2 implements IAccountService {
    private String name;
    private Integer age;
    private Date brith;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBrith(Date brith) {
        this.brith = brith;
    }

    public void saveAccount() {
        System.out.println(this.name+""+this.age+""+this.brith);
    }
}
