package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

// New Concrete Implementor: ApplePayPaymentProcessor
public class ApplePayPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double discountedAmount) {
        System.out.println("Processing payment using Apple Pay...");
        // Apple Pay payment processing logic
    }
}
