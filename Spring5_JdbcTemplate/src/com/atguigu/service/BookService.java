package com.atguigu.service;

import com.atguigu.dao.BookDao;
import com.atguigu.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 * @author superherozhang
 * @create 2022-10-02 12:25
 */
@Service
public class BookService {
    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加的方法
    public void addBook(Book book){
        bookDao.add(book);
    }

    //修改的方法
    public void updateBook(Book book){
        bookDao.update(book);
    }

    //删除的方法
    public void deleteBook(String id){
        bookDao.delete(id);
    }

    //查询返回某个值
    public int queryForOne(){
        return bookDao.queryForOne();
    }

    //查询返回对象
    public Book queryForObject(String id){
        Book book = bookDao.queryForObject(id);
        return book;
    }

    //查询返回集合
    public List<Book> queryForList(){
        return bookDao.queryForList();
    }

    //批量添加操作
    public void batchAdd(List<Object []> args){
        bookDao.batchAdd(args);
    }

    //批量修改操作
    public void batchUpdate(List<Object []> args){
        bookDao.batchUpdate(args);
    }

    //批量删除操作
    public void batchDelete(List<Object []> args){
        bookDao.batchDelete(args);
    }
}
