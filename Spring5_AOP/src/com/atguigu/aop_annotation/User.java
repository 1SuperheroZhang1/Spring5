package com.atguigu.aop_annotation;


import org.springframework.stereotype.Component;

/**
 * 被增强的类
 * @author superherozhang
 * @create 2022-10-01 19:05
 */
//被增强的类
@Component
public class User {
    public void add(){
        System.out.println("add.......");
    }
}
