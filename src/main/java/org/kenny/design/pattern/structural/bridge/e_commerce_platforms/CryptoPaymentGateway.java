package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

public class CryptoPaymentGateway extends PaymentGateway {
    public CryptoPaymentGateway(PaymentProcessor paymentProcessor,  TransactionLogger consoleLogger) {
        super(paymentProcessor, consoleLogger);
    }

    @Override
    void processPayment() {
        System.out.println("Processing cryptocurrency payment...");
        paymentProcessor.processPayment();
        transactionLogger.logTransaction(paymentProcessor.getClass().getSimpleName() + ": " + this.getClass().getSimpleName() + " processed successfully.");
    }
}
