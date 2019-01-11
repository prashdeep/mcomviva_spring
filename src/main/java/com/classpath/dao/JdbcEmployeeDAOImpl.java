package com.classpath.dao;

import com.classpath.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class JdbcEmployeeDAOImpl implements EmployeeDAO {

    private JdbcTemplate jdbcTemplate;

    public JdbcEmployeeDAOImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(Employee employee) {
        System.out.println("**** Inside the JdbcEmployeeDAOImple save metho ....****");
        this.jdbcTemplate.execute("insert into employee (id, name) values ("+employee.getId()+" , '"+employee.getName()+"');");
    }

    @Override
    public List<Employee> listAll() {
        String sql = "SELECT * FROM employee";
        List<Employee> empList = new ArrayList<Employee>();
        List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(sql);

        for (Map<String, Object> row : rows) {
            Employee emp = new Employee((int)row.get("id"), (String)row.get("name"));
            empList.add(emp);
        }
        return empList;
    }

    @Override
    public Employee findById(long empId) {
        // TODO Auto-generated method stub
        List<Employee> list =  this.jdbcTemplate.queryForList("select * from employee where id= '"+empId+"');", Employee.class);
        return list.get(0);
    }

    @Override
    public void deleteEmployeeById(long empId) {
        // TODO Auto-generated method stub
        this.jdbcTemplate.execute("delete  from employee where id= '"+empId+"'");

    }
}