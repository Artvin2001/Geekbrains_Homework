package com.company.lesson6;

public class Main {
    public static void main(String[] args) {
        //примеры работы
        Dog dogExample = new Dog("Бобик", 3);
        dogExample.run(120);
        dogExample.run(600);
        dogExample.run(-5);
        dogExample.swim(5);
        dogExample.swim(100);
        dogExample.swim(-4);

        Cat catExample = new Cat("Барсик", 6);
        catExample.run(25);
        catExample.run(230);
        catExample.run(-2);
        catExample.swim(23);
    }
}
