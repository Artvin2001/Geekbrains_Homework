package com.company.lesson4;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static int SIZE = 3;
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
    public static boolean checkWin(char symb) {

        boolean flag = true;
        //проверка строк
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            flag = true;

            for (int j = 0; j < DOTS_TO_WIN; j++) {
                if (map[i][j] != symb)
                    flag = false;
            }

            if (flag == true)
                return flag;
        }

        //проверка столбцов
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            flag = true;

            for (int j = 0; j < DOTS_TO_WIN; j++) {
                if (map[j][i] != symb)
                    flag = false;
            }

            if (flag == true)
                return flag;
        }

        //проверка главной диагонали
        flag = true;
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[i][i] != symb)
                flag = false;

        }

        if (flag == true)
            return flag;

        //проверка побочной диагонали
        flag = true;

        for (int i = 0; i < DOTS_TO_WIN; i++) {
            for (int j = 0; j < DOTS_TO_WIN; j++) {
                if (i + j == DOTS_TO_WIN - 1 && map[i][j] != symb)
                    flag = false;
            }

        }

        if (flag == true)
            return flag;
        return false;
    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}