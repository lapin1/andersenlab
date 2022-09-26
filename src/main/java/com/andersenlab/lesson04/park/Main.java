package com.andersenlab.lesson04.park;

public class Main {
    public static void main(String[] args) {
        Park park = new Park();

        Park.Attraction attraction = new Park.Attraction("Carousel", 500);
        Park.Attraction attraction2 = new Park.Attraction("Wild horse", 200);
        Park.Attraction attraction3 = new Park.Attraction("Cars", 400);
        Park.Attraction attraction4 = new Park.Attraction("london Eye", 99999999);
        Park.Attraction attraction5 = new Park.Attraction("Laugh room", 100);

        park.addToAttractions(attraction);
        park.addToAttractions(attraction2);
        park.addToAttractions(attraction3);
        park.addToAttractions(attraction4);
        park.addToAttractions(attraction5);

        park.showAttractionsInfo();
    }
}
