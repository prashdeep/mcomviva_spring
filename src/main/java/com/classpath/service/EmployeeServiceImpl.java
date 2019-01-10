package com.classpath.service;

import com.classpath.dao.EmployeeDAO;
import com.classpath.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    @Qualifier("inMemoryEmployeeDAO")
    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(@Qualifier("inMemoryEmployeeDAO") EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public void insertEmployee(Employee employee) {
        //validations
        System.out.println("Came insde the insert Employee method ....");
        employeeDAO.save(employee);
    }


    public List<Employee> findAllEmployees() {
        System.out.println("Came inside the findAllEmployees method ....");
        return employeeDAO.listAll();
    }


    public Employee findEmployeeById(long empId) {
        System.out.println("Came inside the findEmployeeById method ....");
        return employeeDAO.findById(empId);
    }

    @Override
    public void deleteEmployeeById(long empId) {
        System.out.println("Came inside the deleteEmployeeById method ....");
        employeeDAO.deleteEmployeeById(empId);
    }

}
