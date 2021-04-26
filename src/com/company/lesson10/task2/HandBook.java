package com.company.lesson10.task2;

import java.util.HashMap;

public class HandBook {
    private HashMap<String, String> directory;

    public HandBook(HashMap<String, String> directory)
    {
        this.directory = directory;
    }

    public void add(String surname, String phone)
    {
        this.directory.put(surname, phone);
    }

    public void get(String surname)
    {
        System.out.println(this.directory.get(surname));
    }
};
