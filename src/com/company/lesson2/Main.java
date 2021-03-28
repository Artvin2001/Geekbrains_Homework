package com.company.lesson2;

public class Main {

    public static void main(String[] args){
        int a = 2;

    }

    public static void invertArray(){
        int[] arr = {1, 0, 0, 1, 0, 1};

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) arr[i] = 1;
    }

    public static void fillArray() {
        int[] arr = new int[8];
        int coef = 3;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * coef;
        }
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;

        }
    }

    public static void fillDiagonalElements() {
        int length = 4;
        int[][] matrix = new int [length][length];

        for (int i = 0; i < length; i++)
            for (int j = 0; j < length; j++)
            {
                if (i == j || i + j == length + 1)
                    matrix[i][j] = 1;
            }
    }

    public static void findMaxMin() {
        int[] arr = {6, -7, 1, 8, 2};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];

            if (arr[i] > max)
                max = arr[i];
        }
    }

    public static boolean isSumEqual(int[] arr)
    {
        int sum_l = 0;
        int sum_r = 0;
        boolean result = false;

        for (int i = 1; i < arr.length; i++) {
            sum_l = 0;
            sum_r = 0;

            for (int j = 0; j < i; j++)
                sum_l += arr[j];

            for (int j = i; j < arr.length; j++)
                sum_r += arr[j];

            if (sum_l == sum_r)
                result = true;
        }

        return result;
    }

}

