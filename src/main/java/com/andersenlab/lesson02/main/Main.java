package com.andersenlab.lesson02.main;

public class Main {
    public static void main(String[] args) {
        NumberTask numberTask = new NumberTask();
        ArrayTask arrayTask = new ArrayTask();

        //tasks with numbers
        System.out.println(numberTask.checkSumInTheRange(5, 7));
        numberTask.checkNumberWithCondition(-6);
        System.out.println(numberTask.checkNumberWithLogic(5));
        System.out.println(numberTask.checkLeapYear(2022));

        //tasks with arrays
        arrayTask.printString("String", 9);
        arrayTask.replaceValueInArray();
        arrayTask.fillArray();
        arrayTask.increaseValueInArray();
        arrayTask.fillTheDiagonalsOfArray(6);
        arrayTask.initArrayWithParameters(6, 1);
        arrayTask.moveElementsInArray(new int[]{1, 2, 3, 4, 5}, 3);


    }
}
