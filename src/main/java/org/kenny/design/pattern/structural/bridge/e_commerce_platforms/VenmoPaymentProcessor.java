package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

public class VenmoPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double discountedAmount) {
        System.out.println("Processing payment using Venmo...");
        // Venmo payment processing logic
    }
}


