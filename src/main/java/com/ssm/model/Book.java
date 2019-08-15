package com.ssm.model;

public class Book {
    private String bookId;
    private String bookName;
    private String bookAuthor;
    private String bookContent;
    private String bookAddDate;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookContent() {
        return bookContent;
    }

    public void setBookContent(String bookContent) {
        this.bookContent = bookContent;
    }

    public String getBookAddDate() {
        return bookAddDate;
    }

    public void setBookAddDate(String bookAddDate) {
        this.bookAddDate = bookAddDate;
    }
}
