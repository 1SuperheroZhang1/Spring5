package com.atguigu.dao;

import com.atguigu.entity.Book;

import java.util.List;

/**
 * @author superherozhang
 * @create 2022-10-02 12:26
 */
public interface BookDao {
    //添加的方法
    void add(Book book);

    //修改的方法
    void update(Book book);

    //删除的方法
    void delete(String id);

    //查询返回某个值
    int queryForOne();

    //查询返回对象
    Book queryForObject(String id);

    //查询返回集合
    List<Book> queryForList();

    //批量添加操作
    void batchAdd(List<Object[]> args);

    //批量修改操作
    void batchUpdate(List<Object[]> args);

    //批量删除操作
    void batchDelete(List<Object[]> args);
}
