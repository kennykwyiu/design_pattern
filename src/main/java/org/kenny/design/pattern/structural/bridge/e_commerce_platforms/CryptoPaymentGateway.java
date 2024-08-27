package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

public class CryptoPaymentGateway extends PaymentGateway {
    public CryptoPaymentGateway(PaymentProcessor paymentProcessor) {
        super(paymentProcessor);
    }

    @Override
    void processPayment() {
        System.out.println("Processing cryptocurrency payment...");
        paymentProcessor.processPayment();
    }
}
