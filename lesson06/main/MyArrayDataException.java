package com.andersenlab.lesson06.main;

public class MyArrayDataException extends Exception{

    public final int i;
    public final int j;

    MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

    }
}
