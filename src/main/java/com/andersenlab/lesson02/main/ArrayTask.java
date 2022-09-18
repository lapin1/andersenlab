package com.andersenlab.lesson02.main;

public class ArrayTask {

    //task04
    public void printString(String string, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(string);
        }
    }

    //task05
    public void replaceValueInArray() {
        int[] array = {1, 0, 1, 0, 1, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else if (array[i] == 0) {
                array[i] = 1;
            }
        }

        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    //task06
    public void fillArray() {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    //task07
    public void increaseValueInArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        //check value in array and increase it
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }

        for (int j : array) {
            System.out.print(j + " ");
        }

    }

    //task08
    public void fillTheDiagonalsOfArray(int arraySize) {
        if (arraySize < 0 || arraySize == 0) {
            System.out.println("Некорректная размерность массива, значение должно быть > 0");
        } else {
            int[][] array = new int[arraySize][arraySize];

            //fill main diagonal
            for (int i = 0; i < arraySize; i++) {
                for (int j = 0; j < arraySize; j++) {
                    if (i == j) {
                        array[i][j] = 1;
                    }
                }
            }

            //fill side diagonal
            for (int i = 0; i < arraySize; i++) {
                for (int j = 0; j < arraySize; j++) {
                    array[i][arraySize - i - 1] = 1;
                }
            }

            for (int i = 0; i < arraySize; i++) {
                for (int j = 0; j < arraySize; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    //task09
    public void initArrayWithParameters(int len, int initialValue) {
        if (len < 0 || initialValue < 0) {
            System.out.println("Некорректные данные, значения должны быть неотрицательными");
        } else {
            int[] array = new int[len];

            for (int i = 0; i < len; i++) {
                array[i] = initialValue;
            }
            for (int j : array) {
                System.out.print(j + " ");
            }
        }
    }

    //task with ***
    public void moveElementsInArray(int[] array, int n) {

        for (int i = 0; i < n; i++) {
            int tmp = array[array.length - 1];
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = tmp;
        }

        for (int j : array) {
            System.out.print(j + " ");
        }


    }


}
