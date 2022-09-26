package com.andersenlab.lesson04.animal;

import java.util.Objects;

public class Plate {
    private int food;

    public Plate() {
    }

    public Plate(int food) {
        this.food = food;
    }

    public void plateInfo() {
        System.out.println("Plate has " + food + " of food");
    }

    public boolean decreaseFood(int amount) {
        boolean result = false;
        if (amount <= food) {
            food -= amount;
            result = true;
        } else {
            System.out.println("Insufficient amount of food in plate");
        }
        return result;
    }

    public void addFood(int amount) {
        food += amount;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plate plate = (Plate) o;
        return food == plate.food;
    }

    @Override
    public int hashCode() {
        return Objects.hash(food);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
