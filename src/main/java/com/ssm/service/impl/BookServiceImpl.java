package com.ssm.service.impl;

import com.ssm.dao.BookDao;
import com.ssm.model.Book;
import com.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired(required=false)
    private BookDao bookDao;

    @Override
    public int addBook(Book book) {
        return bookDao.addBook(book);
    }

    @Override
    public int deleteBookById(String id) {
        return bookDao.deleteBookById(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    @Override
    public Book queryById(String id) {
        return bookDao.queryById(id);
    }

    @Override
    public List<Book> queryAllBook() {
        return bookDao.queryAllBook();
    }
}