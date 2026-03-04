package com.adnan.design_patterns.strategy_pattern.payment_strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(new CartItem("1", "iPhone 13", 40_000, 1));
        shoppingCart.addItem(new CartItem("2", "Book 1", 2_000, 2));
//        shoppingCart.updateItem("2", new CartItem("2", "Book 1", 2_000, 1));
        shoppingCart.addItem(new CartItem("3", "Test", 1000, 1));
        shoppingCart.deleteItem("3");

        System.out.println(shoppingCart.getCartItems());

        shoppingCart.setPaymentStrategy(new UpiPayment("123456789@ybl"));
        shoppingCart.checkout();
    }
}