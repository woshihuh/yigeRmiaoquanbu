package com.spring.service.impl;

import com.spring.dao.IAccountDao;
import com.spring.domain.Account;
import com.spring.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;


@Repository("accountService")
@Transactional(propagation = Propagation.NOT_SUPPORTED)
public class AccountServiceImpl implements IAccountService {

        @Autowired
        private IAccountDao accountDao;


        public Account findAccountById(Integer accountId) {
            return accountDao.findAccountById(accountId);
        }

        public void transfer(final String sourceName,final String targetName,final Float money) {


                     System.out.println("transfer开始执行");

                     Account source=accountDao.findAccountByName(sourceName);

                     Account target=accountDao.findAccountByName(targetName);

                     source.setMoney(source.getMoney()-money);

                     target.setMoney(target.getMoney()+money);
                     accountDao.updateAccount(source);

                     accountDao.updateAccount(target);
                 }



    }


