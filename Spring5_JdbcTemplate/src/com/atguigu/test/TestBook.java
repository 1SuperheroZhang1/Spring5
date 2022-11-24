package com.atguigu.test;

import com.atguigu.entity.Book;
import com.atguigu.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author superherozhang
 * @create 2022-10-02 12:58
 */
public class TestBook {
    @Test
    public void testJdbcTemplate(){
        //1.加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("jdbctemplate.xml");
        //2.获取对象
        BookService service = context.getBean("bookService", BookService.class);

        //添加
//        Book book=new Book();
//        book.setBookId("1");
//        book.setName("java");
//        book.setBook_status("A");
//        service.addBook(book);

        //修改
//        Book book=new Book();
//        book.setBookId("1");
//        book.setName("database");
//        book.setBook_status("A+");
//        service.updateBook(book);

        //删除
//       service.deleteBook("1");

        //查询返回某个值
//        int count = service.queryForOne();
//        System.out.println(count);

        //查询返回对象
//        Book book = service.queryForObject("1");
//        System.out.println(book);

        //查询返回集合
//        List<Book> list = service.queryForList();
//        System.out.println(list);

        //批量添加
//        List<Object[]> list=new ArrayList<>();
//        Object [] o1={"3","c++","B+"};
//        Object [] o2={"4","c","B"};
//        Object [] o3={"5","spring","A++"};
//        list.add(o1);
//        list.add(o2);
//        list.add(o3);
//        //调用方法实现批量添加操作
//        service.batchAdd(list);

        //批量修改
//        List<Object[]> list=new ArrayList<>();
//        Object [] o1={"c++_1010","B-","3"};
//        Object [] o2={"c_1001","B+","4"};
//        Object [] o3={"spring_1011","A++*","5"};
//        list.add(o1);
//        list.add(o2);
//        list.add(o3);
//        //调用方法实现批量修改操作
//        service.batchUpdate(list);

        //批量删除
        List<Object[]> list=new ArrayList<>();
        Object [] o1={"3"};
        Object [] o2={"4"};
        Object [] o3={"5"};
        list.add(o1);
        list.add(o2);
        list.add(o3);
        //调用方法实现批量删除操作
        service.batchDelete(list);
    }
}
