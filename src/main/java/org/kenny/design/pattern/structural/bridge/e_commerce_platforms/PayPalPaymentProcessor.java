package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

public class PayPalPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double discountedAmount) {
        System.out.println("Processing payment using PayPal...");
        // PayPal payment processing logic
    }
}
