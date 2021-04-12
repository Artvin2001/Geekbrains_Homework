package com.company.lesson6;

public class Cat extends Animal{
    public Cat(String name, int age)
    {
        super(name, age);
    }

    @Override
    public void run(int distance) {
        if (distance <= 200 && distance >= 0)
        {
            System.out.println(name + " пробежал " + distance + " метров");
        }
        else if (distance < 0)
        {
            System.out.println("Расстояние должно быть положительным.");
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
