//package com.spring.config;
//
//import com.spring.factory.BeanFactory;
//import com.spring.utils.ConnectionUtils;
//import com.spring.utils.TransactionManager;
//import org.apache.commons.dbutils.QueryRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.annotation.Scope;
//
//@ComponentScan("com.spring")
//@PropertySource("classpath:jdbcConfig.properties")
//public class SpringConfiguration {
//    @Bean(name="runner")
//    @Scope("prototype")
//    public QueryRunner createQueryRunner(){
//        return new QueryRunner();
//    }
//
//    @Bean(name="txManager")
//    public TransactionManager createTransactionManager(){
//        return new TransactionManager();
//    }
//
//    @Bean(name="connectionUtils")
//    public ConnectionUtils createConnectionUtils(){
//        return new ConnectionUtils();
//    }
//    @Bean
//    public BeanFactory createBeanFactory(){
//        return new BeanFactory();
//    }
//
//}
