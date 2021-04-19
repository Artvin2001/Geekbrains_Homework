package com.company.lesson8;

public class RunnigTrack implements Barrier{

    private int distance;

    public RunnigTrack(int distance)
    {
        this.distance = distance;
    }

    public boolean overcome(int maxMemberDistance)
    {
        if (maxMemberDistance >= distance) {
            System.out.println("Успешно пробежал.");
            return true;
        }
        else {
            System.out.println("Не смог пробежать.");
            return false;
        }
    }

    public int getDistance()
    {
        return distance;
    }
}
