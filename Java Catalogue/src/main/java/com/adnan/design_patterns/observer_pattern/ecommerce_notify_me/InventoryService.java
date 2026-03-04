package com.adnan.design_patterns.observer_pattern.ecommerce_notify_me;

import java.util.HashMap;
import java.util.Map;

public class InventoryService {
    Map<String, Product> productMap = new HashMap<>();
    NotificationService notificationService;

    public InventoryService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void addProduct(Product p) {
        this.productMap.put(p.getId(), p);
    }

    public void subscribeForNotification(String productId, StockObserver o) {
        this.notificationService.subscribe(productId, o);
    }

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