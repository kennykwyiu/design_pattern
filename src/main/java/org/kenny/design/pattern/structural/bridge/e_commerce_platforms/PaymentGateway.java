package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

abstract class PaymentGateway {
    protected PaymentProcessor paymentProcessor;

    public PaymentGateway(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    abstract void processPayment();
}
