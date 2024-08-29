package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

public class CreditCardPaymentGateway extends PaymentGateway {


    public CreditCardPaymentGateway(PaymentProcessor paymentProcessor, TransactionLogger transactionLogger, Discount discount, Reward reward) {
        super(paymentProcessor, transactionLogger, discount, reward);
    }

//    @Override
//    void processPayment() {
//        System.out.println("Processing credit card payment...");
//        paymentProcessor.processPayment();
//        transactionLogger.logTransaction(paymentProcessor.getClass().getSimpleName() + ": " + this.getClass().getSimpleName() + " processed successfully.");
//    }
}
