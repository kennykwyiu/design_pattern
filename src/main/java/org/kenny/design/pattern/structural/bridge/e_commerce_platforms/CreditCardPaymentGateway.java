package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

public class CreditCardPaymentGateway extends PaymentGateway {
    public CreditCardPaymentGateway(PaymentProcessor paymentProcessor) {
        super(paymentProcessor);
    }

    @Override
    void processPayment() {
        System.out.println("Processing credit card payment...");
        paymentProcessor.processPayment();
    }
}
