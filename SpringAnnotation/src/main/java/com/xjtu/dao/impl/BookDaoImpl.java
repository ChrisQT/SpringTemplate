package com.xjtu.dao.impl;

import com.xjtu.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("bookDao")
@Scope("singleton")
public class BookDaoImpl implements BookDao {

    public void save() {
        System.out.println("book dao saved!");
    }

    @PostConstruct
    public void init(){
        System.out.println("book dao init!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("book dao destroy!");
    }
}
