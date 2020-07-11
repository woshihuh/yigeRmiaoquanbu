package com.spring;

import com.spring.dao.IAccountDao;
import com.spring.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  ClassPathXmlApplicationContext:能加载类路径下的配置文件
 *  FileSystemXmlApplicationContext:能加载任何路径下的配置文件，前提是有访问权限
 *  AnnotationConfigApplicationContext:作用于注解创建容器的
 *
 */

public class SecondMain {

    public static void main(String[] args) throws Exception {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as= (IAccountService) ac.getBean("accountService");
        IAccountDao adao=  ac.getBean("accountDao",IAccountDao.class);
        System.out.println(as);
        System.out.println(adao);
        as.saveAccount();

//        Resource resource=new ClassPathResource("bean.xml");
//        BeanFactory factory=new XmlBeanFactory(resource);
//        IAccountService as= (IAccountService) factory.getBean("accountService");
//        System.out.println(as);
     }
}
