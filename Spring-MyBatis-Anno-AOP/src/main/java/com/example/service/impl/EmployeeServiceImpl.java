package com.example.service.impl;

import com.example.dao.EmployeeDao;
import com.example.domain.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> selectAll(){
        return employeeDao.selectAll();
    }

    @Override
    public Employee getById(Integer id) {
        return employeeDao.findById(id);
    }

    @Override
    public void add(Employee emp) {
        employeeDao.add(emp);
    }

    @Override
    public void swapInfo(int id1, int id2) {
        Employee emp1 = employeeDao.findById(id1);
        Employee emp2 = employeeDao.findById(id2);
        emp1.setEmp_no(id2);
        emp2.setEmp_no(id1);
        employeeDao.set(emp1);
        employeeDao.set(emp2);
    }
}
