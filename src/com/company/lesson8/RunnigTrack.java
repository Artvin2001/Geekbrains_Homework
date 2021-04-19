package com.company.lesson8;

public class RunnigTrack implements Barrier{
    //private int length;
    private int distance;

    public RunnigTrack(int distance)
    {
        this.distance = distance;
    }

    public void overcome(int maxMemberDistance)
    {
        if (maxMemberDistance >= distance)
            System.out.println("Успешно пробежал.");
        else
            System.out.println("Не смог пробежать.");
    }

    public int getDistance()
    {
        return distance;
    }
}
