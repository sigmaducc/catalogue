package com.adnan.design_patterns.observer_pattern.ecommerce_notify_me;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationService {
    private final Map<String, List<StockObserver>> waitlist = new HashMap<>();

    public void subscribe(String product, StockObserver o) {
        this.waitlist.computeIfAbsent(product, k -> new ArrayList<>()).add(o);
    }

    public void unsubscribe(String product, StockObserver o) {
        List<StockObserver> list = this.waitlist.get(product);
        if(list != null) {
            if(!list.isEmpty()) list.remove(o);
        }
    }

    public void notifySubscribers(Product product) {
        List<StockObserver> list = this.waitlist.get(product.getId());
        if(list != null) {
            for(StockObserver o: list) {
                o.onStockAvailable(product);
            }
            this.waitlist.remove(product.getId());
        }
    }

}