package com.company.lesson10.task1;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String args[])
    {
        String[] wordsArray = new String[12];
        wordsArray[0] = "moon";
        wordsArray[1] = "tree";
        wordsArray[2] = "lemon";
        wordsArray[3] = "flower";
        wordsArray[4] = "tree";
        wordsArray[5] = "tree";
        wordsArray[6] = "moon";
        wordsArray[7] = "fantasy";
        wordsArray[8] = "apple";
        wordsArray[9] = "flower";
        wordsArray[10] = "cat";
        wordsArray[11] = "moon";

        Integer temp;

        HashMap<String, Integer> wordsHashMap = new HashMap<>();
        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsHashMap.containsKey(wordsArray[i]) == true)
            {
                temp = wordsHashMap.get(wordsArray[i]);
                temp++;
                wordsHashMap.replace(wordsArray[i], temp);
            }
            else
            {
                wordsHashMap.put(wordsArray[i], 1);
            }

        }
        System.out.println(wordsHashMap);

    }
};
