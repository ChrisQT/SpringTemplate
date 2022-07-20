package com.xjtu.dao.factory;

import com.xjtu.dao.UserDao;
import com.xjtu.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
