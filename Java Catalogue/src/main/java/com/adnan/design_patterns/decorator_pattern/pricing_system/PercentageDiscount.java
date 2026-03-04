package com.adnan.design_patterns.decorator_pattern.pricing_system;

public class PercentageDiscount extends Discount {

    private final double percentage;

    public PercentageDiscount(Product product, double percentage) {
        super(product);

        if(percentage < 0 || percentage > 100)
            throw new IllegalStateException("Percentage can only be between 0 and 100.");

        this.percentage = percentage;
    }

    @Override
    public double getPrice() {
        return this.product.getPrice() - (this.product.getPrice() * percentage / 100);
    }

    @Override
    public String toString() {
        return this.product + " - " + percentage + "% Off";
    }

}