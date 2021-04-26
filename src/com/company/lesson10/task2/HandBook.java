package com.company.lesson10.task2;

import java.util.ArrayList;
import java.util.Iterator;

public class HandBook {
    private ArrayList surnames;
    private ArrayList phones;

    public HandBook(ArrayList surnames, ArrayList phones)
    {
        this.surnames = surnames;
        this.phones = phones;
    }

    public void add(String surname, String phone)
    {
        this.surnames.add(surname);
        this.phones.add(phone);
    }

    public void get(String surname)
    {
        Iterator<String> iterSurname = this.surnames.iterator();
        Iterator<String> iterPhone = this.phones.iterator();

        System.out.println("Список телефонов по заданной фамилии " + surname);
        while(iterSurname.hasNext())
        {
            String curSurname = iterSurname.next();
            String curPhone = iterPhone.next();

            if (curSurname == surname)
                System.out.println(curPhone);
        }
    }

};
