package com.company;

import java.util.ArrayList;

public class Office {

    ArrayList<Employee> employees = new ArrayList<>();
    ArrayList<Group> groups = new ArrayList<>();

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void addGroup(Group g){
        groups.add(g);
    }

    public void addEmployee(Employee e){
        employees.add(e);
    }
}
