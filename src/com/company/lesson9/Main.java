package com.company.lesson9;

public class Main {
    public static int sumMatrix(String[][] matrix) throws MyArraySizeException, MyArrayDataException
    {
        if (matrix.length != 4 || matrix[0].length != 4)
            throw new MyArraySizeException("Размер массива не 4X4.");

        int sum = 0;
        int element;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                try {
                    element = Integer.parseInt(matrix[i][j]);
                }
                catch (NumberFormatException errorFormat)
                {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i +"][" + j + "]");
                }
                sum += element;
            }

        }

        return sum;
    }

    public static void main(String[] args)
    {
        String[][] matrix1 = new String[4][4];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix1[i][j] = "a";
            }
        }


        try
        {
            sumMatrix(matrix1);
        }
        catch (MyArraySizeException error)
        {
            System.out.println(error);
        }
        catch (MyArrayDataException errorData)
        {
            System.out.println(errorData);
        }
        return;
    }
}
