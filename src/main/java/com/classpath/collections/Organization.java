package com.classpath.collections;

import java.util.List;

public class Organization {

    private List<String> depts;

    private List<Department> departments;

    public List<String> getDepts() {
        return depts;
    }

    public void setDepts(List<String> depts) {
        this.depts = depts;
    }

    public void setDepartments(List<Department> departments){
        this.departments = departments;
    }

    public List<Department> getDepartments(){
        return this.departments;
    }
}