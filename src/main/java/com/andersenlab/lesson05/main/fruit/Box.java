package com.andersenlab.lesson05.main.fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> box;
    private float boxWeight;

    public Box() {
        this.box = new ArrayList<>();
    }

    public void addToBox(T fruit) {
        box.add(fruit);
        boxWeight += fruit.getWeight();
    }

    public float getBoxWeight() {
        return boxWeight;
    }

    public boolean compare(Box anotherBox) {
        return this.getBoxWeight() == anotherBox.getBoxWeight();
    }

    public void shareFruit(Box anotherBox) {
        anotherBox.box.addAll(box);
        box.clear();
    }


}

