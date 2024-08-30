package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

public class ECommercePlatformExample {
    public static void main(String[] args) {
        PaymentProcessor paypalProcessor = new PayPalPaymentProcessor();
        PaymentProcessor stripeProcessor = new StripePaymentProcessor();
        TransactionLogger consoleLogger = new ConsoleTransactionLogger();

        Discount discount = new PercentageDiscount(10); // 10% discount
        Reward reward = new PointReward(100); // 100 points reward
        PaymentCache paymentCache = new InMemoryPaymentCache();

        PaymentGateway creditCardGateway = new CreditCardPaymentGateway(paypalProcessor, consoleLogger, discount, reward);
        PaymentGateway walletGateway = new WalletPaymentGateway(stripeProcessor, consoleLogger, discount, reward);
        creditCardGateway.setPaymentCache(paymentCache);
        walletGateway.setPaymentCache(paymentCache);

        String paymentKey = "user123_payment1";
        double paymentAmount = 100.0; // Example payment amount
        creditCardGateway.processPayment(paymentKey, paymentAmount);
        walletGateway.processPayment(paymentKey, paymentAmount);


        System.out.println("demonstrate the use of additional payment processors for Venmo and Apple Pay");
        PaymentProcessor venmoProcessor = new VenmoPaymentProcessor();
        PaymentProcessor applePayProcessor = new ApplePayPaymentProcessor();

        PaymentGateway mobilePaymentGateway = new MobilePaymentGateway(venmoProcessor, consoleLogger, discount, reward);
        PaymentGateway cryptoPaymentGateway = new CryptoPaymentGateway(applePayProcessor, consoleLogger, discount, reward);
        mobilePaymentGateway.setPaymentCache(paymentCache);
        cryptoPaymentGateway.setPaymentCache(paymentCache);

        mobilePaymentGateway.processPayment(paymentKey, paymentAmount);
        cryptoPaymentGateway.processPayment(paymentKey, paymentAmount);
    }
}
