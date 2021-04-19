package com.company.lesson8;

public class Wall implements Barrier{

    private int distance;

    public Wall(int distance)
    {
        this.distance = distance;
    }

    public boolean overcome(int maxMemberdistance)
    {
        if (maxMemberdistance >= distance) {
            System.out.println("Успешно перепрыгнул.");
            return true;
        }
        else {
            System.out.println("Не смог перепрыгнуть.");
            return false;
        }
    }

    public int getDistance()
    {
        return distance;
    }
}
