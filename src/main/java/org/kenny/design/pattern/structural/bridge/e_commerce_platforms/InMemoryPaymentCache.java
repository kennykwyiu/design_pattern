package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

import java.util.HashMap;
import java.util.Map;

public class InMemoryPaymentCache implements PaymentCache {
    private Map<String, Double> cache = new HashMap<>();

    @Override
    public void cachePayment(String key, double amount) {
        cache.put(key, amount);
    }

    @Override
    public double getPayment(String key) {
        return cache.getOrDefault(key, 0.0);
    }
}
