package org.kenny.design.pattern.behavioral.templatemethod.orderprocessorexample;

public class InStoreOrderProcessor extends OrderProcessor {

    @Override
    void validateOrder() {
        System.out.println("Validating in-store order...");
    }

    @Override
    boolean isPaymentNeeded() {
        return false;
    }

    @Override
    void processPayment() {
        // No payment processing needed for in-store orders
    }

    @Override
    void prepareOrder() {
        System.out.println("Preparing in-store order...");
    }

    @Override
    void shipOrder() {
        System.out.println("Customer picks up in-store order...");
    }
}