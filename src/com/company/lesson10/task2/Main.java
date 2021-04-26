package com.company.lesson10.task2;

import java.util.HashMap;

public class Main {
    public static void main(String[] args)
    {
        HandBook example = new HandBook(new HashMap<>());
        example.add("Иванов", "89056782361");
        example.add("Леонова", "89018293871");
        example.get("Иванов");
    }
};
