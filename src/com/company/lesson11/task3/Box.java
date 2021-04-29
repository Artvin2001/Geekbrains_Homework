package com.company.lesson11.task3;

import java.util.ArrayList;
import java.util.Iterator;

public class Box<T>{
    private ArrayList<T> products;
    private T boxClass;

    public Box(ArrayList<T> products, T boxClass)
    {
        this.products = products;
        this.boxClass = boxClass;
    }

    public void addFruit(T fruit)
    {
        if (fruit.getClass() == boxClass)
        {
            products.add(fruit);
        }
    }

    public float getWeight()
    {
        float weight = 0;

        if (boxClass == Apple.class)
        {
            weight = products.size() * 1f;
        }
        else if (boxClass == Orange.class)
        {
            weight = products.size() * 1.5f;
        }
        return weight;
    }

    public T getBoxClass()
    {
        return boxClass;
    }

    public boolean compare(Box anotherBox)
    {
        if (this.getWeight() == anotherBox.getWeight())
            return true;
        else return false;
    }

    //пересыпать из одной коробки в другую
    public void pourOver(Box anotherBox)
    {
        if (this.boxClass == anotherBox.getBoxClass())
        {
            Iterator<T> iterBox = this.products.iterator();

            while (iterBox.hasNext())
            {
                anotherBox.addFruit(iterBox.next());
            }

        }
    }
}
