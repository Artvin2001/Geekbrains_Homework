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
        String[][] matrixExample = new String[4][4];
        for (int i = 0; i < matrixExample.length; i++) {
            for (int j = 0; j < matrixExample[0].length; j++) {
                matrixExample[i][j] = "1";
            }
        }

        int sum;

        try
        {
            sum = sumMatrix(matrixExample);
            System.out.println("Сумма элементов матрицы: " + sum);
        }
        catch (MyArraySizeException error)
        {
            System.out.println(error);
        }
        catch (MyArrayDataException errorData)
        {
            System.out.println(errorData);
        }

    }
}
