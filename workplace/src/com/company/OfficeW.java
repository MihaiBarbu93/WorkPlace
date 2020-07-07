package com.company;

public class OfficeW extends Employee {

    private boolean junior ;


    OfficeW(String name,Group group, Boolean junior){
        super(name, group);
        this.junior = junior;
    }

    OfficeW(String name,Boolean junior){
        super(name);
        this.junior = junior;
    }

    @Override
    public void calculateSalary() {
        if (this.junior){
            this.salary=1250;
        }else{
            this.salary=1700;
        }

    }
}
