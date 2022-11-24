package com.atguigu.dao;

import com.atguigu.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author superherozhang
 * @create 2022-10-02 12:26
 */
@Repository
public class BookDaoImpl implements BookDao{
    //注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加的方法
    @Override
    public void add(Book book) {
        //1. 创建sql语句
        String sql="insert into t_book values(?,?,?)";
        //2. 调用方法实现
        int update = jdbcTemplate.update(sql, book.getBookId(), book.getName(), book.getBook_status());
        System.out.println(update);
    }

    //修改的方法
    @Override
    public void update(Book book) {
        String sql="update t_book set name=?,book_status=? where book_id=?";
        int update = jdbcTemplate.update(sql, book.getName(), book.getBook_status(), book.getBookId());
        System.out.println(update);
    }

    //删除的方法
    @Override
    public void delete(String id) {
        String sql="delete from t_book where book_id=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }

    //查询返回某个值
    @Override
    public int queryForOne() {
        String sql="select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    //查询返回对象
    @Override
    public Book queryForObject(String id) {
        String sql="select * from t_book where book_id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    //查询返回集合
    @Override
    public List<Book> queryForList() {
        String sql="select * from t_book";
        List<Book> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return list;
    }

    //批量添加
    @Override
    public void batchAdd(List<Object[]> args) {
        String sql="insert into t_book values(?,?,?)";
        int[] lists = jdbcTemplate.batchUpdate(sql, args);
        System.out.println(Arrays.toString(lists));
    }

    //批量修改操作
    @Override
    public void batchUpdate(List<Object[]> args) {
        String sql="update t_book set name=?,book_status=? where book_id=?";
        int[] lists = jdbcTemplate.batchUpdate(sql, args);
        System.out.println(Arrays.toString(lists));
    }

    //批量删除操作
    @Override
    public void batchDelete(List<Object[]> args) {
        String sql="delete from t_book where book_id=?";
        int[] lists = jdbcTemplate.batchUpdate(sql, args);
        System.out.println(Arrays.toString(lists));
    }
}
