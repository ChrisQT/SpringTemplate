package com.example.service.impl;

import com.example.controller.Code;
import com.example.dao.BookDao;
import com.example.domain.Book;
import com.example.exception.BusinessException;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        int res = bookDao.save(book);
        return res > 0;
    }

    @Override
    public boolean update(Book book) {
        int res = bookDao.update(book);
        return res > 0;
    }

    @Override
    public boolean delete(Integer id) {
        int res = bookDao.delete(id);
        return res > 0;
    }

    @Override
    public Book getById(Integer id) {
        if(id < 0){
            throw new BusinessException(Code.BUSINESS_ERR, "参数错误！");
        }
//        try{
//            int i = 1/0;
//        }catch (Exception e){
//            throw new SystemException(Code.SYSTEM_ERR, "服务器出错！");
//        }
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
