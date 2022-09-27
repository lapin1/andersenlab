package com.andersenlab.lesson04.animal;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(200);

        plate.plateInfo();

        Cat[] cats = new Cat[5];

        cats[0] = new Cat("cat1", 32);
        cats[1] = new Cat("cat2", 15);
        cats[2] = new Cat("cat3", 5000);
        cats[3] = new Cat("cat4", 92);
        cats[4] = new Cat("cat5", 4);


        //get food to cats
        for (Cat c : cats) {
            c.eat(plate);
        }

        //check is cat full
        for (Cat c : cats) {
            System.out.println(c.isFull());
        }

        //add food to plate
        plate.addFood(50000);
        plate.plateInfo();

        //feed hungry cat
        cats[2].eat(plate);
        System.out.println(cats[2].isFull());


        Dog dog1 = new Dog("dog1");
        Dog dog2 = new Dog("dog2");
        Dog dog3 = new Dog("dog3");

        dog1.swim(200);
        dog2.run(400);
        dog3.eat(plate);

        System.out.println("Amount of created cats is: " + Cat.getCatAmount());
        System.out.println("Amount of created dogs is: " + Dog.getDogAmount());
        System.out.println("Amount of created animals: " + Animal.getAnimalCounter());


    }
}
