package com.company.lesson8;

public class RunnigTrack {
    private int length;

    public void RunnigTrack(int length)
    {
        this.length = length;
    }

    public void runTrack(int memberMaxDistance)
    {
        if (memberMaxDistance >= length)
            System.out.println("Успешно пробежал.");
        else
            System.out.println("Не смог пробежать.");
    }
}
