package com.andersenlab.lesson04.animal;

import java.util.Objects;

public class Dog extends Animal {
    private String name;
    private static int dogAmount;

    public Dog() {

    }

    public Dog(String name) {
        this.name = name;
        dogAmount++;
    }

    public static int getDogAmount() {
        return dogAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        int distanceLimit = 500;
        if (distance <= distanceLimit) {
            System.out.println(name + " ran " + distance);
        } else {
            System.out.println("Distance for " + name + " is too long");
        }

    }

    @Override
    public void swim(int distance) {
        int swimDistanceLimit = 10;
        if (distance <= swimDistanceLimit) {
            System.out.println(name + " swam " + distance);
        } else {
            System.out.println("Swim distance for " + name + " is too long");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog cat = (Dog) o;
        return name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }
}
