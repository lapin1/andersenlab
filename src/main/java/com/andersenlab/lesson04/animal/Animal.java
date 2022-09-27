package com.andersenlab.lesson04.animal;

public class Animal {
    private String name;
    private static int animalCounter;


    public Animal() {
        animalCounter++;
    }

    public Animal(String name) {
        this.name = name;
    }

    public static int getAnimalCounter() {
        return animalCounter;
    }

    public void run(int distance) {
        System.out.println(getName() + " ran " + distance);
    }

    public void eat(Plate plate) {
        if (this instanceof Dog) {
            System.out.println("Plate is only for cats!");
        } else {
            System.out.println(getName() + " ate ");
        }
    }

    public void swim(int distance) {
        if (this instanceof Cat) {
            System.out.println("Cats can't swim!");
        } else {
            System.out.println(getName() + " swam " + distance);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
