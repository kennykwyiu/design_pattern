package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

public class ECommercePlatformExample {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalPaymentProcessor();
        PaymentProcessor stripeProcessor = new StripePaymentProcessor();

        PaymentGateway creditCardGateway = new CreditCardPaymentGateway(paypalProcessor);
        PaymentGateway walletGateway = new WalletPaymentGateway(stripeProcessor);

        creditCardGateway.processPayment();
        walletGateway.processPayment();
    }
}
