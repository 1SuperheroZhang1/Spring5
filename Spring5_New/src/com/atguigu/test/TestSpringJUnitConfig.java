package com.atguigu.test;

import com.atguigu.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author superherozhang
 * @create 2022-10-04 11:49
 */
@SpringJUnitConfig(locations = "classpath:tx.xml")
public class TestSpringJUnitConfig {
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.accountBalance();
    }
}
