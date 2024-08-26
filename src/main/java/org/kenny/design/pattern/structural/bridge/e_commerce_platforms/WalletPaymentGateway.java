package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

public class WalletPaymentGateway extends PaymentGateway {
    public WalletPaymentGateway(PaymentProcessor paymentProcessor) {
        super(paymentProcessor);
    }

    @Override
    void processPayment() {
        System.out.println("Processing wallet payment...");
        paymentProcessor.processPayment();
    }
}
