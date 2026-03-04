package com.adnan.design_patterns.observer_pattern.ecommerce_notify_me;

public interface InventoryService {

    void addProduct(Product p);

    void subscribeForNotification(String productId, StockObserver o);

    void unsubscribeForNotification(String productId, StockObserver o);

    void restock(String productId, int quantity);

}