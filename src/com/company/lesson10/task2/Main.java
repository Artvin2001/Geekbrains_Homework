package com.company.lesson10.task2;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args)
    {
        HandBook example = new HandBook(new ArrayList(), new ArrayList());
        example.add("Иванов", "89056782361");
        example.add("Леонова", "89018293871");
        example.add("Иванов", "89034712093");

        example.get("Иванов");
    }
};
