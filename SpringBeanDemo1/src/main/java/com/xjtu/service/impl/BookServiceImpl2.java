package com.xjtu.service.impl;

import com.xjtu.dao.BookDao;
import com.xjtu.service.BookService;

public class BookServiceImpl2 implements BookService {
    private BookDao bookDao;
    private String description;

    public BookServiceImpl2(BookDao bookDao, String description) {
        this.bookDao = bookDao;
        this.description = description;
    }

    public void save() {
        System.out.println("Book Serivce2 save" + description);
    }
}
