package com.adnan.design_patterns.decorator_pattern.pricing_system;

public class BaseProduct implements Product {
    private final String name;
    private final double price;

    public BaseProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.name + ": Rs " + this.price;
    }

}