package com.epam.mlm;

public class Runner {
    public static void main(String[] args) {
        Employee employee = Employee.createEmployee("Smit");
        Employee employee1 = new Employee("Smit1");
        Employee employee2 = Employee.createEmployee("Smit2");
        Employee employee3 = Employee.createEmployee("Smit3");
        Employee employee4 = Employee.createEmployee("Smit4");
        Employee employee5 = Employee.createEmployee("Smit5");
        Employee employee6 = Employee.createEmployee("Smit6");
        Employee employee7 = Employee.createEmployee("Smit7");
        Employee employee8 = Employee.createEmployee("Smit8");
        Employee employee9 = Employee.createEmployee("Smit9");

        employee3.addChild(employee6, employee7, employee8);
        employee4.addChild(employee9);
        employee1.addChild(employee3, employee4);
        employee2.addChild(employee5);
        employee.addChild(employee1, employee2);

        employee7.printAllParent(employee7.getParentId());
        employee1.printAllChild();





    }
}
