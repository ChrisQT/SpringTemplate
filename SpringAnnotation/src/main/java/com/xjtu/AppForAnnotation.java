package com.xjtu;

import com.xjtu.config.SpringConfig;
import com.xjtu.dao.BookDao;
import com.xjtu.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.lang.annotation.Annotation;


public class AppForAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        System.out.println(bookDao);
        BookService bookService = (BookService)ctx.getBean(BookService.class);
        System.out.println(bookService);
        bookService.save();
        DataSource ds = ctx.getBean(DataSource.class);
        System.out.println(ds);
        ctx.close();
    }
}
