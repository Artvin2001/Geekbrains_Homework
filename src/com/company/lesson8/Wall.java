package com.company.lesson8;

public class Wall implements Barrier{
    private int height;

    public Wall(int height)
    {
        this.height = height;
    }

    public void overcome(int maxMemberdistance)
    {
        if (maxMemberdistance >= height)
            System.out.println("Успешно перепрыгнул.");
        else
            System.out.println("Не смог перепрыгнуть.");
    }
}
