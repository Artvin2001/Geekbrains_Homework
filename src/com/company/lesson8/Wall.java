package com.company.lesson8;

public class Wall implements Barrier{
    private int distance;

    public Wall(int distance)
    {
        this.distance = distance;
    }

    public void overcome(int maxMemberdistance)
    {
        if (maxMemberdistance >= distance)
            System.out.println("Успешно перепрыгнул.");
        else
            System.out.println("Не смог перепрыгнуть.");
    }

    public int getDistance()
    {
        return distance;
    }
}
