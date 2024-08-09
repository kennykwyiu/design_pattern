package org.kenny.design.pattern.behavioral.templatemethod.orderprocessorexample;

public abstract class OrderProcessor {

    // Template method defining the order processing workflow
    public final void processOrder() {
        validateOrder();
        if (isPaymentNeeded()) {
            processPayment();
        }
        prepareOrder();
        shipOrder();
    }

    // Methods to be implemented by subclasses
    abstract void validateOrder();
    abstract boolean isPaymentNeeded();
    abstract void processPayment();
    abstract void prepareOrder();
    abstract void shipOrder();
}
