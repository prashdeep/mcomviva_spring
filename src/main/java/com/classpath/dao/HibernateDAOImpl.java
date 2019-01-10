package com.classpath.dao;

import java.util.List;

import com.classpath.model.Employee;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class HibernateDAOImpl implements EmployeeDAO{

    private HibernateTemplate hibernateTemplate;

    public HibernateDAOImpl(SessionFactory sessionFactory) {
        this.hibernateTemplate = new HibernateTemplate(sessionFactory);
    }

    @Override
    @Transactional(readOnly = false)
    public void save(Employee employee) {
        this.hibernateTemplate.save(employee);
    }

    @Override
    public List<Employee> listAll() {
        return hibernateTemplate.loadAll(Employee.class);
    }

    @Override
    public Employee findById(long empId) {
        return null;
    }

    @Override
    public void deleteEmployeeById(long empId) {
    }
}
