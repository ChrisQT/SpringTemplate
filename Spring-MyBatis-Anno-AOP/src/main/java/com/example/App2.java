package com.example;

import com.example.config.SpringConfig;
import com.example.domain.Employee;
import com.example.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        EmployeeService employeeService = ctx.getBean(EmployeeService.class);
        Employee e = employeeService.getById(10087);
        System.out.println(e);
    }
}
