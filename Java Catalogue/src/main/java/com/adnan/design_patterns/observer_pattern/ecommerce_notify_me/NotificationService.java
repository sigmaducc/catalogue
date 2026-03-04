package com.adnan.design_patterns.observer_pattern.ecommerce_notify_me;

public interface NotificationService {

    void subscribe(String product, StockObserver o);

    void unsubscribe(String product, StockObserver o);

    void notifySubscribers(Product product);

}