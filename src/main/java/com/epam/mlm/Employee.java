package com.epam.mlm;

import java.util.*;

public class Employee {
    private static long counterId;
    private long id;
    private long parentId;
    private String name;
    private Set<Employee> children = new HashSet<>();
    private static Map<Long, Employee> employees = new HashMap<>();

    public Employee() {
        id = ++counterId;
        employees.put(id,this);
    }

    public Employee(String name) {
        this();
        this.name = name;
    }

    public static Employee createEmployee(String name) {
        return new Employee(name);
    }

    public void addChild(Employee... employees) {
        for (Employee employee : employees) {
            employee.setParentId(id);
            children.add(employee);
        }
    }

    public Employee getEmployee(long id) {
        return employees.get(id);
    }

    public void printAllParent(long parentId){
        if (parentId != 0){
            Employee employee = employees.get(parentId);
            System.out.println(employee);
            printAllParent(employee.parentId);
        }
    }

    public void printAllChild(){
        for (Employee child: children){
            System.out.println(child);
        }
        for (Employee child: children){
            child.printAllChild();
        }
    }

    public long getId() {
        return id;
    }

    public long getParentId() {
        return parentId;
    }

    public String getName() {
        return name;
    }

    public Set<Employee> getChildren() {
        return children;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChildren(Set<Employee> children) {
        this.children = children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                '}';
    }

}
