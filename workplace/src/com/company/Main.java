package com.company;

public class Main {

    public static void main(String[] args) {


        Office office = new Office();
        Group salesGroup1 = new Group(GroupType.SALES, "SALES_FORCE");
        Group officeGroup1 = new Group(GroupType.OFFICE, "STRIKE_FORCE");
        salesGroup1.add(new SalesP("Mihai", salesGroup1));
        salesGroup1.add(new SalesP("Andreea", salesGroup1));
        salesGroup1.add(new SalesP("Andrei", salesGroup1));
        salesGroup1.add(new GroupLead("Ionut", salesGroup1));
        office.addGroup(salesGroup1);
        officeGroup1.add(new OfficeW("Alex", officeGroup1, false));
        officeGroup1.add(new OfficeW("Silviu", officeGroup1, false));
        officeGroup1.add(new OfficeW("Roxana", officeGroup1, true));
        officeGroup1.add(new OfficeW("Ionut", officeGroup1, false));
        officeGroup1.add(new GroupLead("Ioana", officeGroup1));
        office.addGroup(officeGroup1);
        office.addEmployee(new SalesP("Alexandru"));
        office.addEmployee(new OfficeW("Florin", true));

        start(office);

    }
    static void start(Office o){
        int month = 0;
        while(month<13){
            for (Group g: o.getGroups()){
                for(Employee e:g.getEmployees()){
                    e.calculateSalary();
                    e.addingSalary+=e.getSalary();
                    if (!(e instanceof GroupLead)){
                        System.out.println("Part of the group: "+ e.getGroup().getName());
                        System.out.println("Salary for "+ month +" months for "+e.getName()+" with id "+ e.getId()+" is: "+ e.getAddingSalary() + " $");
                    }else{
                        System.out.println("Leader of the group: "+ e.getGroup().getName());
                        System.out.println("Salary for "+ month +" months for Team Leader: "+e.getName()+" with id "+ e.getId()+ " is: " +e.getAddingSalary() + " $");

                    }
                    System.out.println();
                }
            }
            for (Employee e: o.getEmployees()){
                e.calculateSalary();
                e.addingSalary+=e.getSalary();
                System.out.println("Salary for "+ month +" months for "+e.getName()+" with id "+ e.getId() +" is: "+ e.getAddingSalary() + " $");
                System.out.println();
            }
            System.out.println("++++++++++++++++++++++++++++++++++++");
            System.out.println();
            month++;


    }
    }
}
