package com.xjtu.dao.impl;

import com.xjtu.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private int connectionNum;
    private String databaseName;

    public void save() {
        System.out.println("book dao saved in " + databaseName + connectionNum);
    }

    public void init(){
        System.out.println("book dao init!");
    }

    public void destroy(){
        System.out.println("book dao destroy!");
    }

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
}
