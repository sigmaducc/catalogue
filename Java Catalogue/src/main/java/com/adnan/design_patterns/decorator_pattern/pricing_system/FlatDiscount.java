package com.adnan.design_patterns.decorator_pattern.pricing_system;

public class FlatDiscount extends Discount {

    private final double discountAmount;

    public FlatDiscount(Product product, double discountAmount) {
        super(product);
        this.discountAmount = discountAmount;
    }

    @Override
    public double getPrice() {
        return Math.max(0, this.product.getPrice() - discountAmount);
    }

    @Override
    public String toString() {
        return this.product + " - Flat Rs " + discountAmount;
    }

}