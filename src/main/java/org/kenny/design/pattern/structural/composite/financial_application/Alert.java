package org.kenny.design.pattern.structural.composite.financial_application;

public class Alert {
    private String symbol;
    private double targetPrice;
    private String message;

    public Alert(String symbol, double targetPrice, String message) {
        this.symbol = symbol;
        this.targetPrice = targetPrice;
        this.message = message;
    }

    public boolean checkAlert(double currentPrice) {
        if (currentPrice >= targetPrice) {
            System.out.println("Alert for " + symbol + ": " + message);
            return true;
        }
        return false;
    }
}
