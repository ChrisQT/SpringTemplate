package com.xjtu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/employees?useSSL=false&useServerPrepStmts=true";
        String username = "root";
        String psw = "123456";
        Connection conn = DriverManager.getConnection(url, username, psw);
        PreparedStatement pstmt = null;


        conn.setAutoCommit(false);
        String sql = "select * from employees where emp_no > ? limit ?";
        pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1,10086);
        pstmt.setInt(2, 10);
        ResultSet res = pstmt.executeQuery();
        try {

            while(res.next()){
                int id = res.getInt(1);
                String fn = res.getString(3);
                String ln = res.getString(4);
                System.out.println("" + id + ": " + fn + " " + ln);
            }
            conn.commit();
        } catch (Exception throwables) {
            throwables.printStackTrace();
            conn.rollback();
        }
        res.close();
        pstmt.close();
        conn.close();


    }
}
