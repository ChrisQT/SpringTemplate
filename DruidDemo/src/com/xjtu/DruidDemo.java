package com.xjtu;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DruidDemo {
    public static void main(String[] args) throws Exception {

        System.out.println(System.getProperty("user.dir"));
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/druid.properties"));


        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);
        Connection conn = dataSource.getConnection();

        String sql = "SELECT * FROM employees LIMIT 5";
        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery(sql);
        List<Employee> resList = new ArrayList<>();

        while(rs.next()){
            int empNo = rs.getInt("emp_no");
            String birthDate = rs.getString("birth_date");
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            String gender = rs.getString("gender");
            String hireDate = rs.getString("hire_date");

            resList.add(new Employee(empNo,birthDate,firstName,lastName,gender,hireDate));

        }
        System.out.println(resList);

        rs.close();
        stmt.close();
        conn.close();



    }
}
