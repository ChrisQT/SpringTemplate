package com.xjtu;

import com.xjtu.dao.BookDao;
import com.xjtu.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppOfBook {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
        BookService bookservice = (BookService) ctx.getBean(BookService.class);
        System.out.println(bookservice);
    }
}
