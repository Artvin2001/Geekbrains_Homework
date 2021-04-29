package com.company.lesson11.task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Apple> appleList = new ArrayList<>();
        Box boxExample = new Box(appleList, Apple.class);
        Apple apple1 = new Apple();
        boxExample.addFruit(apple1);
        System.out.println(boxExample.getWeight());

        ArrayList<Orange> orangeList = new ArrayList<>();
        Box boxExampleOrange = new Box(orangeList, Orange.class);
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        boxExampleOrange.addFruit(orange1);
        boxExampleOrange.addFruit(orange2);
        System.out.println(boxExampleOrange.getWeight());

        System.out.println(boxExample.compare(boxExampleOrange));
    }
};
