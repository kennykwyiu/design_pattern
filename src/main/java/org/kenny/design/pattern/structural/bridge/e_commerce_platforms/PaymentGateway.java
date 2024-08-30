package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

abstract class PaymentGateway {
    protected PaymentProcessor paymentProcessor;
    protected TransactionLogger transactionLogger;
    protected Discount discount;
    protected Reward reward;
    protected PaymentCache paymentCache;

    public PaymentGateway(PaymentProcessor paymentProcessor, TransactionLogger transactionLogger, Discount discount, Reward reward) {
        this.paymentProcessor = paymentProcessor;
        this.transactionLogger = transactionLogger;
        this.discount = discount;
        this.reward = reward;
    }

    public void setPaymentCache(PaymentCache paymentCache) {
        this.paymentCache = paymentCache;
    }

    void processPayment(String key, double amount) {
        try {
//            System.out.println("Initiating payment process...");
//            paymentProcessor.processPayment();
//            transactionLogger.logTransaction("Payment processed successfully.");

            double cachedAmount = paymentCache.getPayment(key);
            if (cachedAmount == 0.0) {
                System.out.println("Payment not found in cache. Processing payment...");

                System.out.println("Initiating payment process...");
                double discountedAmount = discount.applyDiscount(amount);
                System.out.println("After applying discount, the new amount is: " + discountedAmount);

                paymentProcessor.processPayment(discountedAmount);
//            transactionLogger.logTransaction("Payment processed successfully.");
                transactionLogger.logTransaction(paymentProcessor.getClass().getSimpleName() + ": " + this.getClass().getSimpleName() + " processed successfully.");

                reward.applyReward();
                paymentCache.cachePayment(key, discountedAmount);
            } else {
                System.out.println("Payment found in cache. Skipping payment processing.");
                System.out.println("Cached payment amount: " + cachedAmount);
            }


        } catch (Exception e) {
            transactionLogger.logTransaction("Payment processing failed. Error: " + e.getMessage());
        }
    }
}
