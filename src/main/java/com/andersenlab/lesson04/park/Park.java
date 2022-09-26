package com.andersenlab.lesson04.park;

import java.util.ArrayList;
import java.util.Arrays;

public class Park {
    private ArrayList<Attraction> attractions = new ArrayList<Attraction>();

    public Park() {
    }

    public void addToAttractions(Attraction attraction) {
        attractions.add(attraction);
    }

    public void removeFromAttractions(Attraction attraction) {
        if (!(attractions.isEmpty())) {
            attractions.remove(attraction);
        } else {
            System.out.println("List is empty!");
        }

    }

    public void showAttractionsInfo() {
        System.out.println(attractions);
    }

    public static class Attraction {
        private String name;
        private final String[] WORK_TIME = new String[]{"Mon: 8:00-20:00", "Tue: 8:00-20:00", "Wed: 8:00-20:00", "Thu: 8:00-20:00", "Fri: 8:00-20:00", "Sat: 8:00-20:00", "Sun: 8:00-20:00"};
        private double cost;

        public Attraction(String name, double cost) {
            this.name = name;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' + "\n" +
                    ", work time=" + Arrays.toString(WORK_TIME) + "\n" +
                    ", cost=" + cost +
                    '}' + "\n";
        }
    }
}
