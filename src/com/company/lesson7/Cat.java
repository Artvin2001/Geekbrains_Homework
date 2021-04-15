package com.company.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        int result;
        result = p.decreaseFood(appetite);

        if (result == 0)
        {
            satiety = true;
        }
    }

    public void catInfo()
    {
        if (satiety == true)
            System.out.println(name + " сытый");
        else
            System.out.println(name + " голодный");
    }

}
