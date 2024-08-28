package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

public class ECommercePlatformExample {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalPaymentProcessor();
        PaymentProcessor stripeProcessor = new StripePaymentProcessor();
        TransactionLogger consoleLogger = new ConsoleTransactionLogger();

        PaymentGateway creditCardGateway = new CreditCardPaymentGateway(paypalProcessor);
        PaymentGateway walletGateway = new WalletPaymentGateway(stripeProcessor, consoleLogger);

        creditCardGateway.processPayment();
        walletGateway.processPayment();


        System.out.println("demonstrate the use of additional payment processors for Venmo and Apple Pay");
        PaymentProcessor venmoProcessor = new VenmoPaymentProcessor();
        PaymentProcessor applePayProcessor = new ApplePayPaymentProcessor();

        PaymentGateway mobilePaymentGateway = new MobilePaymentGateway(venmoProcessor, consoleLogger);
        PaymentGateway cryptoPaymentGateway = new CryptoPaymentGateway(applePayProcessor, consoleLogger);

        mobilePaymentGateway.processPayment();
        cryptoPaymentGateway.processPayment();
    }
}
