package com.xjtu.dao.factory;

import com.xjtu.dao.OrderDao;
import com.xjtu.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
//        System.out.println("order dao factory init!");
        return new OrderDaoImpl();
    }
}
