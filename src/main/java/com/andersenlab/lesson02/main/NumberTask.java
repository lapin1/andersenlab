package com.andersenlab.lesson02.main;

public class NumberTask {

    //task01
    public boolean checkSumInTheRange(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    //task02
    public void checkNumberWithCondition(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //task03
    public boolean checkNumberWithLogic(int a) {
        return (!(a >= 0));
    }

    //task with *
    public boolean checkLeapYear(int year) {
        return (year % 4 != 0 ^ year % 100 != 0 ^ year % 400 == 0);
    }

}
