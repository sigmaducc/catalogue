package com.adnan.design_patterns.decorator_pattern.pricing_system;

import java.util.HashMap;
import java.util.Map;

public class CouponDiscount extends Discount {
    private final String coupon;
    private final double couponDiscount;

    Map<String, Double> couponMap = Map.of(
        "SAVE1000", 1000.0,
        "SAVE100", 100.0,
        "FIRST50", 50.0
    );

    public CouponDiscount(Product product, String coupon) {
        super(product);

        this.coupon = coupon;
        this.couponDiscount = couponMap.getOrDefault(coupon, 0.0);
    }

    @Override
    public double getPrice() {
        return this.product.getPrice() - couponDiscount;
    }

    @Override
    public String toString() {
        return this.product + " - Rs " + couponDiscount + " Off from " + coupon;
    }

}