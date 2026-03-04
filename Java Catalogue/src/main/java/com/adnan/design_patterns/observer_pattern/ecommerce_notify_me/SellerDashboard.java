package com.adnan.design_patterns.observer_pattern.ecommerce_notify_me;

public class SellerDashboard implements StockObserver {

    @Override
    public void onStockAvailable(Product product) {
        System.out.println("Seller inventory dashboard updated for " + product.getName());
    }

}