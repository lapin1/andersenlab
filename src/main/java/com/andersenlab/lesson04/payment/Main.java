package com.andersenlab.lesson04.payment;

public class Main {
    public static void main(String[] args) {

        Payment payment = new Payment();

        //create goods
        Merchandise merch1 = new Merchandise("Stone", 500);
        Merchandise merch2 = new Merchandise("Scissors", 400);
        Merchandise merch3 = new Merchandise("Paper", 900);


        //add goods to basket
        Payment.Basket.addToBasket(merch1);
        Payment.Basket.addToBasket(merch2);
        Payment.Basket.addToBasket(merch3);


        payment.showTotal();

        Payment.Basket.removeFromBasket(merch2);

        payment.showTotal();

    }
}
