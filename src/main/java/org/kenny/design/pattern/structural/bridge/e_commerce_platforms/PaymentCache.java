package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

public interface PaymentCache {
    void cachePayment(String key, double amount);
    double getPayment(String key);
}
