package com.company.lesson11.task1;

public class Main {
    public static void exchange(ArrayElement firstElement, ArrayElement secondElement)
    {
        ArrayElement temp = new ArrayElement<>(firstElement.get());
        firstElement.set(secondElement.get());
        secondElement.set(temp.get());
    }
    public static void main(String[] args)
    {
        ArrayElement<Integer>[] array = new ArrayElement[4];
        array[0] = new ArrayElement<>(2);
        array[1] = new ArrayElement<>(5);
        array[2] = new ArrayElement<>(-5);
        array[3] = new ArrayElement<>(7);

        exchange(array[0], array[1]);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].get());
        }
    }
};
