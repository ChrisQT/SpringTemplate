package com.example.service;

import com.example.config.SpringConfig;
import com.example.domain.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class EmployeeServiceTest {
    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testSelectById(){
        System.out.println(employeeService.getById(10086));
    }

    @Test
    public void testAdd(){
        Employee emp = new Employee();
        emp.setBirth_date("1999-10-10");
        emp.setFirst_name("Kaggo");
        emp.setHire_date("2020-1-1");
        emp.setGender("M");
        emp.setLast_name("Mar");
        employeeService.add(emp);
    }

    @Test
    public void testSwap(){
        employeeService.swapInfo(10001,10002);
    }
}
