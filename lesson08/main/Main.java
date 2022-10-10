package com.andersenlab.lesson08.main;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String[] listOfWords = {"tiger", "tiger", "dog", "cat", "dolphin", "tiger", "cheetah", "mouse", "cheetah", "rabbit", "dragon", "dragon", "tesla", "wolf", "bear", "panther", "leopard", "lion", "cheetah"};
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(listOfWords));

        //1.1. count every word
        for (String key : uniqueWords) {
            System.out.println(key + ": " + Collections.frequency(Arrays.asList(listOfWords), key));
        }

        //1.2. only unique
        System.out.println(uniqueWords);


        //2. phonebook
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add(44142032, "Mask");
        phoneBook.add(62242337, "Pitt");
        phoneBook.add(24342035, "Tarantino");
        phoneBook.add(82642137, "Pitt");
        phoneBook.add(13242138, "Ivanov");

        System.out.println(phoneBook.get("Pitt"));


    }
}
