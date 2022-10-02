package com.andersenlab.lesson06.main;

public class ArrayTask {

    public static int provideArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        String message = "Incorrect length";

        for (int i = 0; i < array.length; i++) {
            if (array.length != 4) {
                throw new MyArraySizeException(message);
            }
            for (int j = 0; j < array.length; j++) {
                if (array[i].length != 4) {
                    throw new MyArraySizeException(message);
                }
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException exception) {
                    throw new MyArrayDataException(i, j);
                }

            }
        }
        return sum;

    }
}
