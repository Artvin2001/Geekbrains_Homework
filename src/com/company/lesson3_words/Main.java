package com.company.lesson3_words;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
            "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
            "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {
        String hiddenWord = words[random.nextInt(words.length)];

        while (true) {
            System.out.println("Введите слово:");
            String answer = scanner.nextLine();

            if (answer.equals(hiddenWord))
            {
                System.out.println("Вы угадали!");
                break;
            }
            else
            {
                StringBuilder resultStr = compareWords(answer, hiddenWord);
                System.out.println("Попробуйте еще раз.");
                System.out.println(resultStr.toString());
            }
        }

        scanner.close();
    }

    public static StringBuilder compareWords(String answer, String hiddenWord)
    {
        StringBuilder resultStr = new StringBuilder();

        for (int i = 0; i < answer.length(); i++) {
            if (i < hiddenWord.length())
            {
                if (answer.charAt(i) == hiddenWord.charAt(i))
                    resultStr.append(answer.charAt(i));
                else
                    resultStr.append("#");
            }

        }

        resultStr.append("##############");
        return resultStr;
    }
}
