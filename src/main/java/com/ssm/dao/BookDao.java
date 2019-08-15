package com.ssm.dao;

import com.ssm.model.Book;
import java.util.List;

public interface BookDao {
    int addBook(Book book);

    int deleteBookById(String id);

    int updateBook(Book book);

    Book queryById(String id);

    List<Book> queryAllBook();
}
