package com.atguigu.entity;

/**
 * @author superherozhang
 * @create 2022-10-02 12:40
 */
public class Book {
    private String bookId;
    private String name;
    private String book_status;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBook_status() {
        return book_status;
    }

    public void setBook_status(String book_status) {
        this.book_status = book_status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", name='" + name + '\'' +
                ", book_status='" + book_status + '\'' +
                '}';
    }
}
