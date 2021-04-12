package com.company.lesson6;

public class Cat extends Animal{
    public Cat(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void run(int distance) {
        if (distance <= 200)
        {
            System.out.println(name + " пробежал " + distance + " метров");
        }
        else {
            System.out.println("Слишком большое расстояние.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }
}
