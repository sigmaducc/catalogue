package com.adnan.design_patterns.observer_pattern.ecommerce_notify_me;

public class AnalyticsService implements StockObserver {

    @Override
    public void onStockAvailable(Product product) {
        System.out.println("Analytics: Restock event for " + product.getName());
    }

}