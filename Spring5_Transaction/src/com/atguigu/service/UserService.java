package com.atguigu.service;

import com.atguigu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author superherozhang
 * @create 2022-10-02 15:11
 */
@Repository
//@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ,
//timeout = -1,readOnly = false,rollbackFor = NullPointerException.class,
//noRollbackFor = ArithmeticException.class
//)
public class UserService {
    //注入dao
    @Autowired
    private UserDao userDao;

    //转账的方法
    public void accountBalance(){
        //try{
            // 第一步：开启事务

            // 第二步：进行业务操作
            //lucy少100
            userDao.reduceMoney();
            //模拟异常
            int i=10/0;
            //mary多100
            userDao.addMoney();
            //第三步：没有发生异常，提交事务

        //}catch (Exception e){
            //第四步：发生异常，回滚事务
        //}
    }
}
