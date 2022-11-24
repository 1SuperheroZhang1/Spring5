package com.atguigu.aop_annotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author superherozhang
 * @create 2022-10-01 19:53
 */
@Component
@Aspect
@Order(1)
public class PersonProxy {
    @Before(value="execution(* com.atguigu.aop_annotation.User.add())")
    public void before(){
        System.out.println("Person before.........");
    }
}
