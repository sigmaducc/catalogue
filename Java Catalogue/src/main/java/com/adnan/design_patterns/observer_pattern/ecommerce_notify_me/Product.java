package com.adnan.design_patterns.observer_pattern.ecommerce_notify_me;

public class Product {
    private final String id;
    private final String productName;
    private final double price;
    private int stock;

    public Product(String id, String productName, double price, int stock) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    public boolean isOutOfStock() {
        return this.stock == 0;
    }

    public void addStock(int quantity) {
        this.stock += quantity;
    }

    public double getPrice() { return this.price; }
    public int getStock() { return this.stock; }
    public String getName() { return this.productName; }
    public String getId() { return this.id; }
}