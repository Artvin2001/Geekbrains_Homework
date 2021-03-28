package com.company.lesson1;

public class Main {

    public static void main(String[] args) {
	   int ic = 5;
	   short sh = 3;
	   byte bt = 2;
	   long lg = 46793068293L;
	   double db = 5.67;
	   float flt = -7.89F;
	   char ch = 'c';
	   boolean bool = true;
	   String str = "Anna";

	   //примеры работы
	   float a3 = 5.6F;
	   float b3 = 7.8F;
	   float c3 = -4.3F;
	   float d3 = 1.2F;
	   float res3 = task3(a3, b3, c3, d3);
	   System.out.println("Result 3 = " + res3);

	   int a4 = 15;
	   int b4 = -3;
	   boolean res4 = task4(a4, b4);
	   System.out.println("Result 4 = " + res4);

	   task5(a4);

	   boolean res6 = task6(b4);
	   System.out.println("Result 6 = " + res6);

	   task7(str);

	   int year = 300;
	   task8(year);
    }
    public static float task3(float a, float b, float c, float d) {
    	float result = a * (b + (c / d));
    	return result;
	}

	public static boolean task4(int a, int b)
	{
		int sum = a + b;
		boolean result;
		if (sum >= 10 && sum <= 20)
			result = true;
		else
			result = false;
		return result;
	}

	public static void task5(int a) {
    	if (a < 0)
			System.out.println("Negative number");
    	else
			System.out.println("Positive number");
	}

	public static boolean task6(int a) {
    	if (a < 0)
    		return true;
    	else
    		return false;
	}

	public static void task7(String str) {
		System.out.println("Привет," + str);
	}

	public static void task8(int year)
	{
		if (year % 400 == 0)
			System.out.println("Високосный год");
		else if (year % 100 == 0)
			System.out.println("Год не является високосным");
		else if (year % 4 == 0)
			System.out.println("Високосный год");
		else
			System.out.println("Год не является високосным");
	}
}
