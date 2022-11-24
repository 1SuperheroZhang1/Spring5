package com.atguigu.test;

import com.atguigu.aop_annotation.User;
import com.atguigu.aop_xml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author superherozhang
 * @create 2022-10-01 19:33
 */
public class TestAOP {
    @Test
    public void testAopAnnotation(){
        //1.加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("aop_annotation.xml");
        //
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testAopXml(){
        //1.加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("aop_xml.xml");
        //
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
