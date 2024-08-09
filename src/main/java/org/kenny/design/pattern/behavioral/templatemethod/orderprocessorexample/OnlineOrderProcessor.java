package org.kenny.design.pattern.behavioral.templatemethod.orderprocessorexample;

public class OnlineOrderProcessor extends OrderProcessor {

    @Override
    void validateOrder() {
        System.out.println("Validating online order...");
    }

    @Override
    boolean isPaymentNeeded() {
        return true;
    }

    @Override
    void processPayment() {
        System.out.println("Processing online payment...");
    }

    @Override
    void prepareOrder() {
        System.out.println("Preparing online order...");
    }

    @Override
    void shipOrder() {
        System.out.println("Shipping online order...");
    }
}
