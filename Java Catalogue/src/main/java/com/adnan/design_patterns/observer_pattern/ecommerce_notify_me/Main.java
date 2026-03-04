package com.adnan.design_patterns.observer_pattern.ecommerce_notify_me;

public class Main {
    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryService(new NotificationService());

        Product iPhone = new Product("P001", "iPhone 13", 40_000, 0);
        Product macbook = new Product("P002", "MacBook M5 Pro", 400_000, 0);

        inventoryService.addProduct(iPhone);
        inventoryService.addProduct(macbook);

        User alice = new User("Alice", "alice@gmail.com");
        User bob = new User("Bob", "bob@gmail.com");
        User john = new User("John", "john@gmail.com");

        inventoryService.subscribeForNotification(iPhone.getId(), alice);
        inventoryService.subscribeForNotification(iPhone.getId(), new AnalyticsService());
        inventoryService.subscribeForNotification(iPhone.getId(), new SellerDashboard());

        inventoryService.subscribeForNotification(macbook.getId(), bob);
        inventoryService.subscribeForNotification(macbook.getId(), john);
        inventoryService.subscribeForNotification(macbook.getId(), new AnalyticsService());
        inventoryService.subscribeForNotification(macbook.getId(), new SellerDashboard());

        inventoryService.restock(iPhone.getId(), 5);
        inventoryService.restock(macbook.getId(), 2);
    }
}
