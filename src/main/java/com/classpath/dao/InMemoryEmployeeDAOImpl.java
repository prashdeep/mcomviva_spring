package com.classpath.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.classpath.model.Employee;
import org.springframework.stereotype.Repository;



public class InMemoryEmployeeDAOImpl implements EmployeeDAO {

    private Map<Long, Employee> employeeMap = new HashMap<>();

    public void save(Employee employee) {
        System.out.println("Came inside the save method of Inmemroy");
        employeeMap.put(employee.getId(), employee);
    }

    public List<Employee> listAll() {
        List<Employee> empList = new ArrayList<>();
        employeeMap.values().forEach(employee -> empList.add(employee) );
        return empList;
    }

    public Employee findById(long empId) {
        return employeeMap.get(empId);
    }

    public void deleteEmployeeById(long empId) {
        employeeMap.remove(empId);
    }
}
