package com.andersenlab.lesson04.animal;

import java.util.Objects;

public class Cat extends Animal {
    private String name;
    private int appetite;
    private boolean satiety;
    private static int catAmount;

    public Cat() {

    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        catAmount++;
    }

    public static int getCatAmount() {
        return catAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    @Override
    public void run(int distance) {
        int distanceLimit = 200;
        if (distance <= distanceLimit) {
            super.run(distance);
        } else {
            System.out.println("Distance for " + name + " is too long");
        }

    }

    @Override
    public void eat(Plate plate) {
        if (plate.decreaseFood(getAppetite())) {
            super.eat(plate);
            satiety = true;
        }
    }

    public boolean isFull() {
        return satiety;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }

}
