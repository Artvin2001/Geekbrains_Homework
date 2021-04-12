package com.company.lesson6;

public class Main {
    public static void main(String[] args) {
        //примеры работы
        Dog dogBobik = new Dog("Бобик", 3);
        dogBobik.run(120);
        dogBobik.run(600);
        dogBobik.run(-5);
        dogBobik.swim(5);
        dogBobik.swim(100);
        dogBobik.swim(-4);

        Cat catBarsik = new Cat("Барсик", 6);
        catBarsik.run(25);
        catBarsik.run(230);
        catBarsik.run(-2);
        catBarsik.swim(23);
    }
}
