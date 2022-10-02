package com.andersenlab.lesson06.main;

public class Main {
    public static void main(String[] args) {

        String[][] array = new String[][]{{"1", "2", "3", "h"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};

        try {
            try {
                System.out.println("Sum is: " + ArrayTask.provideArray(array));
            } catch (MyArraySizeException exception) {
                System.out.println("Incorrect size of provided array");
            }
        } catch (MyArrayDataException exception) {
            System.out.println("Incorrect value at cell: " + "[" + exception.i + "]" + "[" + exception.j + "]");

        }


    }
}
