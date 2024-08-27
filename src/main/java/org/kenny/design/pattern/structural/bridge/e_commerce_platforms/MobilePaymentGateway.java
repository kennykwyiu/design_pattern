package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

public class MobilePaymentGateway extends PaymentGateway {
    public MobilePaymentGateway(PaymentProcessor paymentProcessor) {
        super(paymentProcessor);
    }

    @Override
    void processPayment() {
        System.out.println("Processing mobile payment...");
        paymentProcessor.processPayment();
    }
}

