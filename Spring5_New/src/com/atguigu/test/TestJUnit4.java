package com.atguigu.test;

import com.atguigu.dao.User;
import com.atguigu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author superherozhang
 * @create 2022-10-04 11:49
 */
@RunWith(SpringJUnit4ClassRunner.class)  //单元测试框架
@ContextConfiguration("classpath:tx.xml") //加载配置文件
public class TestJUnit4 {
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.accountBalance();
    }
}
