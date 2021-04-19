package com.company.lesson8;

public class Robot implements Member{
    private int maxDistance;
    private int maxHeight;

    public Robot(int maxDistance, int maxHeight)
    {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    public void run(int distance)
    {
        System.out.println("Робот бежит.");
    }

    public void jump(int height)
    {
        System.out.println("Робот прыгает.");
    }

    public int getMaxDistance()
    {
        return maxDistance;
    }

    public int getMaxHeight(){
        return maxHeight;
    }
}
