package com.andersenlab.lesson05.main.fruit;

public class Main {
    public static void main(String[] args) {

        Box<Apple> boxApple = new Box<>();
        Box<Apple> anotherBoxApple = new Box<>();
        Box<Orange> boxOrange = new Box<>();

        boxApple.addToBox(new Apple());
        boxApple.addToBox(new Apple());
        boxApple.addToBox(new Apple());

        anotherBoxApple.addToBox(new Apple());
        anotherBoxApple.addToBox(new Apple());

        boxOrange.addToBox(new Orange());
        boxOrange.addToBox(new Orange());
        boxOrange.addToBox(new Orange());
        boxOrange.addToBox(new Orange());


        System.out.println(boxApple.getBoxWeight());
        System.out.println(anotherBoxApple.getBoxWeight());
        System.out.println(boxOrange.getBoxWeight());

        System.out.println(boxApple.compare(anotherBoxApple));
        System.out.println(boxOrange.compare(boxApple));

        boxApple.shareFruit(anotherBoxApple);

        System.out.println(boxApple.getBoxWeight());


    }
}
