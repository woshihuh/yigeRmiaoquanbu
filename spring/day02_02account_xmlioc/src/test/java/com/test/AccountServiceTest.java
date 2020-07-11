package com.test;

import com.spring.config.SpringConfiguration;
import com.spring.domain.Account;
import com.spring.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class AccountServiceTest {
    @Autowired
    private IAccountService as=null;
    @Test
    public void testFindAll(){
        List<Account> accounts=as.findAllAccount();
        for (Account ac:accounts){
            System.out.println(ac.getName()+"=="+ac.getMoney());
        }
    }
}
