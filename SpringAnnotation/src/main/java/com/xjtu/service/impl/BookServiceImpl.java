package com.xjtu.service.impl;

import com.xjtu.dao.BookDao;
import com.xjtu.dao.impl.BookDaoImpl;
import com.xjtu.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BookServiceImpl implements BookService {

    @Autowired
//    @Qualifier("bookDao2")
    private BookDao bookDao;
    @Value("${name}")
    private String name;

    public void save() {
        System.out.println("Book Service Saved! " + name);
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        System.out.println("set book dao!");
        this.bookDao = bookDao;
    }
}
