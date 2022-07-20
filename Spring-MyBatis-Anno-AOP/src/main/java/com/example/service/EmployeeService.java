package com.example.service;

import com.example.domain.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeService {
    List<Employee> selectAll();
    Employee getById(Integer id);
    void add(Employee emp);
    @Transactional
    void swapInfo(int id1, int id2);
}
