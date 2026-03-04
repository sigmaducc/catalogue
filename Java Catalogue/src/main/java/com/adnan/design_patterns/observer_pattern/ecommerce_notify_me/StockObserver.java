package com.adnan.design_patterns.observer_pattern.ecommerce_notify_me;

public interface StockObserver {
    void onStockAvailable(Product p);
}