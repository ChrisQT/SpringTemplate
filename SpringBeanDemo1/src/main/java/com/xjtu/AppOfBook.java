package com.xjtu;

import com.xjtu.dao.BookDao;
import com.xjtu.dao.OrderDao;
import com.xjtu.service.BookService;
import com.xjtu.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppOfBook {

    public static void main(String[] args) {
//        BookService bookService = new BookServiceImpl();
//        bookService.save();
        // get IoC container
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // get Bean
//        BookDao bookDao = (BookDao)ctx.getBean("bookDao");
//        bookDao.save();
        BookService bookService = (BookService)ctx.getBean("bookService");
        bookService.save();
        ctx.close();
    }
}
