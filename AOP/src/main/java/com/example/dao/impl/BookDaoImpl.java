package com.example.dao.impl;

import com.example.dao.BookDao;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("Book saved!");
    }

    @Override
    public void delete() {
        System.out.println("Book deleted!");
    }

    @Override
    public int select() {
        System.out.println("Book select!");
//        int i = 5/0;
        return 100;
    }
}
