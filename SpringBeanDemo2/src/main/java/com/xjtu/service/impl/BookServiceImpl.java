package com.xjtu.service.impl;

import com.xjtu.dao.BookDao;
import com.xjtu.dao.impl.BookDaoImpl;
import com.xjtu.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void save() {
        System.out.println("Book Service Saved!");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        System.out.println("set book dao!");
        this.bookDao = bookDao;
    }
}
