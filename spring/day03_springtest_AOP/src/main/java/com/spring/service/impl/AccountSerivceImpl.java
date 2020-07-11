package com.spring.service.impl;

import com.spring.dao.IAccountDao;
import com.spring.domain.Account;
import com.spring.service.IAccountService;
import com.spring.utils.TransactionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("accountService")
public class AccountSerivceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;


    public List<Account> findAllAccount() {
         return accountDao.findAllAccount();

    }

    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    public void saveAccount(Account account)
    {
          accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {

          accountDao.updateAccount(account);
    }

    public void deleteAccount(Integer accountId) {

          accountDao.deleteAccount(accountId);
    }

    public void transfer(String sourceName, String targetName, Float money) {
        System.out.println("transfer开始执行");
            Account source=accountDao.findAccountByName(sourceName);

            Account target=accountDao.findAccountByName(targetName);

            source.setMoney(source.getMoney()-money);

            target.setMoney(target.getMoney()+money);

            accountDao.updateAccount(source);

            accountDao.updateAccount(target);

    }
}
