package com.company;

public abstract class Employee {

    private String name;
    private static int count = 0;
    private int id=0;
    private Group group;
    public int salary;
    public int addingSalary=0;

    public Employee(String name, Group group){
        id=count++;
        this.name = name;
        this.group = group;
    }

    public Employee(String name){
        id=count++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAddingSalary() {
        return addingSalary;
    }

    public Group getGroup() {
        return group;
    }

    public abstract void calculateSalary();
}
