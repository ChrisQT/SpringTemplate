package com.example.service;

import com.example.config.SpringConfig;
import com.example.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {
    @Autowired
    private BookService bookService;
    @Test
    public void testGetById(){
        Book book = bookService.getById(1);
        System.out.println(book);
    }

    @Test
    public void testGetAll(){
        List<Book> books = bookService.getAll();
        System.out.println(books);
    }

//    @Test
//    public void testSave(){
//        Book book = new Book();
//        book.setId(null);
//        book.setName("多少第三次");
//        book.setType("大苏打 Science");
//        book.setDescription("实际上");
//        bookService.save(book);
//    }

    @Test
    public void testDelete(){
        bookService.delete(4);
    }

    @Test
    public void testUpdate(){
        Book book = bookService.getById(1);
        book.setDescription("hahadaxiao");
        bookService.update(book);
    }
}
