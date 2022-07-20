package com.xjtu;

import com.xjtu.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppOfBook {

    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        Connection conn = dataSource.getConnection();
        String sql = "select first_name from employees limit 1";
        Statement stmt = conn.createStatement();
        ResultSet res = stmt.executeQuery(sql);
        res.next();
        System.out.println(res.getString(1));

    }
}
