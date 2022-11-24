package com.atguigu.test;

import com.atguigu.service.UserService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author superherozhang
 * @create 2022-10-04 11:49
 */
@ExtendWith(SpringExtension.class) //单元测试框架
@ContextConfiguration("classpath:tx.xml") //加载配置文件
public class TestJUnit5 {
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.accountBalance();
    }
}
