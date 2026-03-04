package com.adnan.design_patterns.decorator_pattern.pricing_system;

public class Main {
    public static void main(String[] args){
        Product iphone = new BaseProduct("iPhone 13", 40_000);

        iphone = new PercentageDiscount(iphone, 50);
        iphone = new FlatDiscount(iphone, 1_000);

        System.out.println(iphone + " = Rs." + iphone.getPrice());

        Product macbook = new BaseProduct("MacBook", 100_000);
        macbook = new PercentageDiscount(macbook, 20);
        macbook = new FlatDiscount(macbook, 10_000);
        macbook = new CouponDiscount(macbook, "SAVE1000");

        System.out.println(macbook + " = Rs." + macbook.getPrice());
    }
}