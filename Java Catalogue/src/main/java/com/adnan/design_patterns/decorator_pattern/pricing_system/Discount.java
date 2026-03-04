package com.adnan.design_patterns.decorator_pattern.pricing_system;

abstract public class Discount implements Product {

    protected Product product;

    public Discount(Product product) {
        this.product = product;
    }

}