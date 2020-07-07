package com.company;

import java.util.Random;

public class SalesP extends Employee{

    SalesP(String name, Group group){
        super(name, group);
    }

    SalesP(String name){
        super(name);
    }

    @Override
    public void calculateSalary() {
        Random r = new Random();
        this.salary =r.nextInt(501)+1500;

    }
}
