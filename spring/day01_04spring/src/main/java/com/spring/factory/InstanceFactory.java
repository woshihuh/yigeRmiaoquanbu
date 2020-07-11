package com.spring.factory;

import com.spring.service.IAccountService;
import com.spring.service.impl.AccountSerivceimpl;

public class InstanceFactory {
    public IAccountService say(){
        return new AccountSerivceimpl();
    }
}
