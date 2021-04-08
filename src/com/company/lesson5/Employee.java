package com.company.lesson5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String telephone;
    private float salary;
    private int age;

    public Employee(String fullName, String position, String email, String telephone, int salary, int age)
    {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge()
    {
        return this.age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
