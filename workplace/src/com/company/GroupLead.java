package com.company;

public class GroupLead extends Employee {

    int baseSalary = 1800;

    GroupLead(String name, Group group){
        super(name, group);
    }

    @Override
    public void calculateSalary() {
        this.salary = baseSalary + (this.getGroup().getEmployees().size()-1)*200;

    }

}
