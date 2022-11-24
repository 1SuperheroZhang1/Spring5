package com.atguigu.test;


import com.atguigu.config.TxConfig;
import com.atguigu.dao.User;
import com.atguigu.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.lang.Nullable;


/**
 * @author superherozhang
 * @create 2022-10-02 12:58
 */
public class Test {

    @Nullable
    private String bookName;

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

    //函数式风格创建对象，交给spring进行管理
    @org.junit.Test
    public void testGenericApplicationContext(){
        //1.创建GenericApplicationContext对象
        GenericApplicationContext context=new GenericApplicationContext();
        //2.调用context的方法进行对象注册
        context.refresh();
//        context.registerBean(User.class,()->new User());
        context.registerBean("user",User.class,()->new User());
        //3.获取在spring注册的对象
//        User user = (User) context.getBean("com.atguigu.dao.User");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
