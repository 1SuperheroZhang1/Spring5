package com.atguigu.test;


import com.atguigu.config.TxConfig;
import com.atguigu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;


/**
 * @author superherozhang
 * @create 2022-10-02 12:58
 */
public class Test {


    @org.junit.Test
    public void testAccountAnnotation(){
        ApplicationContext context=new ClassPathXmlApplicationContext("jdbctemplate.xml");
        UserService service = context.getBean("userService", UserService.class);
        service.accountBalance();
    }

    @org.junit.Test
    public void testAccountXML(){
        ApplicationContext context=new ClassPathXmlApplicationContext("tx.xml");
        UserService service = context.getBean("userService", UserService.class);
        service.accountBalance();
    }

    //报错，待解决！！！
    @org.junit.Test
    public void testAccountConfig(){
        ApplicationContext context=new AnnotationConfigApplicationContext(TxConfig.class);
        UserService service = context.getBean("userService", UserService.class);
        service.accountBalance();
    }

    @org.junit.Test
    public void test(){
        System.out.println("Hello World!");
    }
}
