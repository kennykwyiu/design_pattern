package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

public class MobilePaymentGateway extends PaymentGateway {


    public MobilePaymentGateway(PaymentProcessor paymentProcessor, TransactionLogger transactionLogger, Discount discount, Reward reward) {
        super(paymentProcessor, transactionLogger, discount, reward);
    }

//    @Override
//    void processPayment() {
//        System.out.println("Processing mobile payment...");
//        paymentProcessor.processPayment(discountedAmount);
//        transactionLogger.logTransaction(paymentProcessor.getClass().getSimpleName() + ": " + this.getClass().getSimpleName() + " processed successfully.");
//    }
}

