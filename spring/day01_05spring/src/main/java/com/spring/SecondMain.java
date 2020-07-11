package com.spring;

import com.spring.service.IAccountService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  ClassPathXmlApplicationContext:能加载类路径下的配置文件
 *  FileSystemXmlApplicationContext:能加载任何路径下的配置文件，前提是有访问权限
 *  AnnotationConfigApplicationContext:作用于注解创建容器的
 *
 */

public class SecondMain {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
        IAccountService as3=(IAccountService)ac.getBean("accountService3");
        as3.saveAccount();
//        System.out.println(adao);


//        Resource resource=new ClassPathResource("bean.xml");
//        BeanFactory factory=new XmlBeanFactory(resource);
//        IAccountService as= (IAccountService) factory.getBean("accountService");
//        System.out.println(as);
     }
}
