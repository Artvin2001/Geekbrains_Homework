package com.company.lesson3_numbers;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int MAX_ATTEMPTS = 3;
    public static final int MAX_NUMBER = 10;
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void Main()
    {
        String repeat;

        do {
            int hiddenNumber = random.nextInt(MAX_NUMBER);

            for (int i = 1; i <= MAX_ATTEMPTS; i++) {
                System.out.println("Введите число: ");
                int answer = scanner.nextInt();

                if (answer < hiddenNumber)
                {
                    System.out.println("Загаданное число больше.");
                    System.out.println("Осталось " + (MAX_ATTEMPTS - i) + " попыток");
                }
                else if (answer > hiddenNumber)
                {
                    System.out.println("Загаданное число меньше.");
                    System.out.println("Осталось " + (MAX_ATTEMPTS - i) + " попыток");
                }
                else
                {
                    System.out.println("Вы угадали!");
                    break;
                }

                if (i == MAX_ATTEMPTS)
                {
                    System.out.println("Вы проиграли.");
                }

            }

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
            repeat = scanner.next();
        } while (repeat.equals("да") || repeat.equals("1"));

        scanner.close();
    }
}
