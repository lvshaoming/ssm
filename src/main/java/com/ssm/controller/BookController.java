package com.ssm.controller;

import com.ssm.model.Book;
import com.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Book> list = bookService.queryAllBook();
        model.addAttribute("list", list);
        return "allBook";
    }

    @RequestMapping("toAddBook")
    public String toAddBook() {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Book book) {
        bookService.addBook(book);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/del/{bookId}")
    public String deleteBook(@PathVariable("bookId") String id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    @RequestMapping("toUpdateBook")
    public String toUpdateBook(Model model, String id) {
        model.addAttribute("book", bookService.queryById(id));
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String updateBook(Model model, Book book) {
        bookService.updateBook(book);
        book = bookService.queryById(book.getBookId());
        model.addAttribute("book", book);
        return "redirect:/book/allBook";
    }
}
