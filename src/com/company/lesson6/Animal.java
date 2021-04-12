package com.company.lesson6;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);
}
