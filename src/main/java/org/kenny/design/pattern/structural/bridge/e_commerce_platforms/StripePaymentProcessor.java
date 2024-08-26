package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

public class StripePaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Processing payment using Stripe...");
        // Stripe payment processing logic
    }
}
