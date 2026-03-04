package com.adnan.design_patterns.observer_pattern.ecommerce_notify_me;

public class User implements StockObserver {

    private final String name;
    private final String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void onStockAvailable(Product product) {
        System.out.println("Hey " + this.name + "! " + product.getName() + " is back in stock :D");
    }

}