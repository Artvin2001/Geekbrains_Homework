package com.company.lesson7;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public int decreaseFood(int n) {
        if (food - n >= 0)
        {
            food -= n;
            return 0;
        }
        else {
            return 1;
        }
    }

    public void addFood(int n)
    {
        food += n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}
