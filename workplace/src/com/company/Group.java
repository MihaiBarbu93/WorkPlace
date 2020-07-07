package com.company;

import java.util.ArrayList;

public class Group {

    private String name ;
    private GroupType type;
    private ArrayList<Employee> employees = new ArrayList();

    Group(GroupType type, String name){
        this.type = type;
        this.name = name;
    }

    public void add(Employee e){
        employees.add(e);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}
