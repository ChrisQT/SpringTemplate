package com.xjtu.dao.impl;

import com.xjtu.dao.OrderDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class OrderDaoImpl implements OrderDao {
    public void save() {
        System.out.println("order dao save!");
    }
}
