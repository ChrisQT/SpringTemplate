package com.xjtu;

import com.xjtu.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppOfBook2 {

    public static void main(String[] args) {
//        BookService bookService = new BookServiceImpl();
//        bookService.save();
        // get IoC container
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // get Bean
//        BookDao bookDao = (BookDao)ctx.getBean("bookDao");
//        bookDao.save();
        BookService bookService = (BookService)ctx.getBean("bookService2");
        bookService.save();
        ctx.close();
    }
}
