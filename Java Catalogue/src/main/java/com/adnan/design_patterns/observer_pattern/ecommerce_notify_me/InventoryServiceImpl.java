package com.adnan.design_patterns.observer_pattern.ecommerce_notify_me;

import java.util.HashMap;
import java.util.Map;

public class InventoryServiceImpl implements InventoryService {
    Map<String, Product> productMap = new HashMap<>();
    NotificationService notificationService;

    public InventoryServiceImpl(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void addProduct(Product p) {
        this.productMap.put(p.getId(), p);
    }

    @Override
    public void subscribeForNotification(String productId, StockObserver o) {
        this.notificationService.subscribe(productId, o);
    }

    @Override
    public void unsubscribeForNotification(String productId, StockObserver o) {
        this.notificationService.unsubscribe(productId, o);
    }

    @Override
    public void restock(String productId, int quantity) {
        Product p = productMap.get(productId);

        if(p != null) {
            p.addStock(quantity);
            System.out.println(p.getName() + " is restocked");

            if(p.getStock() > 0) {
                this.notificationService.notifySubscribers(p);
            }
        }
    }

}