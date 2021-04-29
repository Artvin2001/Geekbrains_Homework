package com.company.lesson11.task1;

public class ArrayElement<T> {
    private T element;

    public ArrayElement(T element)
    {
        this.element = element;
    }

    public T get()
    {
        return element;
    }

    public void set(T element)
    {
        this.element = element;
    }
};
