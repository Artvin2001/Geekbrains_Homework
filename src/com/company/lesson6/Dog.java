package com.company.lesson6;

public class Dog extends Animal{
    public Dog(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void run(int distance) {
        if (distance <= 500)
        {
            System.out.println(name + " пробежал " + distance + " метров");
        }
        else {
            System.out.println("Слишком большое расстояние.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance < 10)
        {
            System.out.println(name + " проплыл " + distance + " метров");
        }
        else {
            System.out.println("Слишком большое расстояние.");
        }
    }
}
