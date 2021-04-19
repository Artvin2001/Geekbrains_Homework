package com.company.lesson8;

public class Cat implements Member{
    private int maxDistance;
    private int maxHeight;

    public void Robot(int maxDistance, int maxHeight)
    {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    public void run(int distance)
    {
        System.out.println("Кот бежит.");
    }

    public void jump(int height)
    {
        System.out.println("Кот прыгает.");
    }
}
