package com.company.lesson8;

public class Cat implements Member{

    private int maxDistance;
    private int maxHeight;

    public Cat(int maxDistance, int maxHeight)
    {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    public void run()
    {
        System.out.println("Кот бежит.");
    }

    public void jump()
    {
        System.out.println("Кот прыгает.");
    }

    public int getMaxDistance()
    {
        return maxDistance;
    }

    public int getMaxHeight(){
        return maxHeight;
    }

}
