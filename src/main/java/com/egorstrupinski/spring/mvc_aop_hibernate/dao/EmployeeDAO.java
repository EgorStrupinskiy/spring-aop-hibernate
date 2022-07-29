package com.egorstrupinski.spring.mvc_aop_hibernate.dao;

import com.egorstrupinski.spring.mvc_aop_hibernate.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    void deleteEmployee(int id);
}
