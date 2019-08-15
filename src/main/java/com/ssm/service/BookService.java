package com.ssm.service;

import com.ssm.model.Book;

import java.util.List;

public interface BookService {

    int addBook(Book book);

    int deleteBookById(String id);

    int updateBook(Book book);

    Book queryById(String id);

    List<Book> queryAllBook();
}
