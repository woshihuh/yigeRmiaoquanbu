package com.spring.service.impl;

import com.spring.dao.IAccountDao;
import com.spring.dao.impl.AccountDao;
import com.spring.service.IAccountService;

public class AccountSerivceimpl implements IAccountService {
    IAccountDao aDao=new AccountDao();
     public AccountSerivceimpl(){
        System.out.println("创建成功");
    }
    public void saveAccount() {
         aDao.saveAccount();
    }
}
