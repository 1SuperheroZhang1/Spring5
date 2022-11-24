package com.atguigu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author superherozhang
 * @create 2022-10-02 15:13
 */
@Repository
public class UserDaoImpl implements UserDao{
    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //少钱
    @Override
    public void reduceMoney() {
        String sql="update t_account set balance=balance-? where name=?";
        jdbcTemplate.update(sql,100,"lucy");
    }

    //多钱
    @Override
    public void addMoney() {
        String sql="update t_account set balance=balance+? where name=?";
        jdbcTemplate.update(sql,100,"mary");
    }
}
