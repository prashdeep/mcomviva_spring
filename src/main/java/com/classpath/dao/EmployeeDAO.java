package com.classpath.dao;

import com.classpath.model.Employee;

import java.util.List;

public interface EmployeeDAO {

    public void save(Employee employee);

    public List<Employee> listAll();

    public Employee findById(long empId);

    public void deleteEmployeeById(long empId);

}