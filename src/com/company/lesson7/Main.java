package com.company.lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] catArray = new Cat[4];
        catArray[0] = new Cat("Барсик", 40, false);
        catArray[1] = new Cat("Мурзик", 25, false);
        catArray[2] = new Cat("Джим", 15, true);
        catArray[3] = new Cat("Пушок", 20, false);

        Plate plate = new Plate(75);

        for (int i = 0; i < catArray.length; i++) {
            catArray[i].eat(plate);
            catArray[i].catInfo();
        }
    }

}
