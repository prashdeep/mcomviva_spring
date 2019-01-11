package com.classpath.service;

import com.classpath.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class EmployeeServiceClient {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        EmployeeService employeeService = context.getBean("employeeService", EmployeeServiceImpl.class);
        Employee employee1 = new Employee(12, "Vinayak");
        Employee employee2 = new Employee(13, "Vinayak");
        Employee employee3 = new Employee(14, "Vinayak");
        Employee employee4 = new Employee(15, "Vinayak");
        employeeService.insertEmployee(employee1);
        employeeService.insertEmployee(employee2);
        employeeService.insertEmployee(employee3);
        employeeService.insertEmployee(employee4);

        List<Employee> employeeList = employeeService.findAllEmployees();
        System.out.println(employeeList);

    }
}