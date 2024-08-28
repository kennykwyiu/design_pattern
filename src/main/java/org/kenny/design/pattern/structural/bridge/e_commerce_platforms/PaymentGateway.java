package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

abstract class PaymentGateway {
    protected PaymentProcessor paymentProcessor;
    protected TransactionLogger transactionLogger;

    public PaymentGateway(PaymentProcessor paymentProcessor, TransactionLogger transactionLogger) {
        this.paymentProcessor = paymentProcessor;
        this.transactionLogger = transactionLogger;
    }

    void processPayment() {
        try {
            System.out.println("Initiating payment process...");
            paymentProcessor.processPayment();
            transactionLogger.logTransaction("Payment processed successfully.");
        } catch (Exception e) {
            transactionLogger.logTransaction("Payment processing failed. Error: " + e.getMessage());
        }
    }
}
