package com.company.lesson9;

public class Main {
    public static void checkMatrixSize(String[][] matrix) throws MyArraySizeException
    {
        if (matrix.length != 4 || matrix[0].length != 4)
            throw new MyArraySizeException("Размер массива не 4X4.");
    }

    public static void main(String[] args)
    {
        String[][] matrix1 = new String[2][2];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                matrix1[i][j] = "5";
            }
        }


        try
        {
            checkMatrixSize(matrix1);
        }
        catch (MyArraySizeException error)
        {
            System.out.println(error);
        }
        return;
    }
}
