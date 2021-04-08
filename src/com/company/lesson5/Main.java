package com.company.lesson5;

public class Main {
    public static void main(String[] args) {

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Danilov Ivan Stepanovich", "Manager", "dan43@mail.ru",
                "89564362412", 40000, 27);
        employeeArray[1] = new Employee("Semenova Julia Dmitrievna", "Designer", "julst5@gmail.com",
                "89673728120", 100000, 41);
        employeeArray[2] = new Employee("Volkova Vera Ivanovna", "Economist", "ververv@yandex.ru",
                "89044162482", 60000, 34);
        employeeArray[3] = new Employee("Ivanov Sergey Leonidovich", "Journalist", "iserg34@mail.ru",
                "89027618993", 95000, 46);
        employeeArray[4] = new Employee("Sergeeva Elena Vladimirovna", "Manager", "lenoch29@gmail.com",
                "89564362412", 58000, 26);

        int currentAge;
        String str;

        for (int i = 0; i < employeeArray.length; i++) {
            currentAge = employeeArray[i].getAge();

            if (currentAge > 40) {
                str = employeeArray[i].toString();
                System.out.println(str);
            }
        }
    }
}
