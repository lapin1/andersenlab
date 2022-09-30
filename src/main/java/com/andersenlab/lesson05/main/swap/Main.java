package com.andersenlab.lesson05.main.swap;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] tigerArray = {"tiger1", "tiger2", "tiger3", "tiger4", "tiger5"};

        System.out.println(Arrays.toString(tigerArray));

        swap(tigerArray, 1, 4);

        System.out.println(Arrays.toString(tigerArray));

    }

    public static void swap(String[] array, int first, int second) {
        if (first > 0 && first <= array.length && second > 0 && second <= array.length) {
            for (int i = 0; i < array.length; i++) {
                String tmp = array[first - 1];
                array[first - 1] = array[second - 1];
                array[second - 1] = tmp;
            }
        } else System.out.println("Incorrect values!");

    }
}
