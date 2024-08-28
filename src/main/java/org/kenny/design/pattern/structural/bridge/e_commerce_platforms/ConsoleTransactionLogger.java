package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

public class ConsoleTransactionLogger implements TransactionLogger {
    @Override
    public void logTransaction(String message) {
        System.out.println("Transaction Log: " + message);
    }
}
