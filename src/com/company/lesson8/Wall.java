package com.company.lesson8;

public class Wall {
    private int height;

    public void Wall(int height)
    {
        this.height = height;
    }

    public void jumpWall(int memberMaxHeight)
    {
        if (memberMaxHeight >= height)
            System.out.println("Успешно перепрыгнул.");
        else
            System.out.println("Не смог перепрыгнуть.");
    }
}
