package com.andersenlab.lesson04.payment;


import java.util.ArrayList;

public class Payment {
    private static double totalPrice;

    public Payment() {
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void showTotal() {
        System.out.println(Basket.getMerchandise());
        System.out.println("total price: " + totalPrice);
    }


    public static class Basket {
        private static final ArrayList<Merchandise> goods = new ArrayList<>();

        public static ArrayList<Merchandise> getMerchandise() {
            return goods;

        }

        //add goods to basket
        public static void addToBasket(Merchandise merchandise) {
            goods.add(merchandise);
            totalPrice += merchandise.getPrice();
        }

        //remove from basket
        public static void removeFromBasket(Merchandise good) {
            if (!(goods.isEmpty())) {
                goods.remove(good);
                totalPrice -= good.getPrice();
            } else {
                System.out.println("Your basket is empty");
            }

        }

    }
}