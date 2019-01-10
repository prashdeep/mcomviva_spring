package com.classpath.service;

import com.classpath.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface  EmployeeService {

    public void insertEmployee(Employee employee);

    public List<Employee> findAllEmployees();

    public Employee findEmployeeById(long empId);

    public void deleteEmployeeById(long empId);
}