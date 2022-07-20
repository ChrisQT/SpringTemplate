package com.example.dao;

import com.example.domain.Employee;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface EmployeeDao {
//    @Select("select * from employees limit 10")
    List<Employee> selectAll();

//    @Select("select * from employees where emp_No= #{id} ")
    Employee findById(Integer id);

    void add(Employee emp);

    void set(Employee emp);
}
