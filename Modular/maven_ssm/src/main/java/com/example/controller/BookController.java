package com.example.controller;

import com.example.domain.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping
    public Result save(@RequestBody Book book){
//        System.out.println("book save ==> " + book);
//        return "{'module':'book save'}";
        boolean flag =  bookService.save(book);
        return new Result(flag? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
//        System.out.println("user delete "+ id);
//        return "{'module':'delete'}";
        boolean flag = bookService.delete(id);
        return new Result(flag? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @PutMapping
    public Result update(@RequestBody Book book){
//        System.out.println("user update "+ emp);
//        return "{'module':'update'}";
        boolean flag = bookService.update(book);
        return new Result(flag? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
//        System.out.println("user getById "+ id);
//        return "{'module':'getById'}";
        Book book = bookService.getById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "" : "查询失败，请重试！";
        return new Result(code, book, msg);
    }

    @GetMapping
    public Result getAll(){
//        List<Book> emps = new ArrayList<>();
//        Book book = new Book();
//        book.setName("三句话");
//        book.setType("玄幻");
//        book.setDescription("精通人性的女讲师");
//        emps.add(book);
//
//        book = new Book();
//        book.setName("让男人给我转了十八万");
//        book.setType("悬疑");
//        book.setDescription("蛤蛤大笑");
//        emps.add(book);
//        System.out.println("book getAll ");
//        return emps;

        List<Book> books = bookService.getAll();
//        int i = 5/0;
        Integer code = books != null ? Code.GET_OK : Code.GET_ERR;
        String msg = books != null ? "" : "查询失败，请重试！";
        return new Result(code, books, msg);
    }
}
