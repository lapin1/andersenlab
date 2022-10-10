package com.andersenlab.lesson08.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PhoneBook {
    private final Map<Integer, String> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(int number, String lastName) {
        phoneBook.put(number, lastName);
    }

    //find by last name
    public List<String> get(String lastName) {
        List<String> foundNumbers = new ArrayList<>();
        for (Map.Entry<Integer, String> items : phoneBook.entrySet()) {
            if (lastName.equalsIgnoreCase(items.getValue())) {
                foundNumbers.add(items.getValue() + ": " + items.getKey());
            }
        }
        if (foundNumbers.size() == 0) {
            foundNumbers.add("Not found");
        }
        return foundNumbers;


    }
}
