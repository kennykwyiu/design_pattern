package org.kenny.design.pattern.structural.composite.financial_application;

public class MarketUpdate {
    private String symbol;
    private double price;

    public MarketUpdate(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    public void display() {
        System.out.println("Symbol: " + symbol);
        System.out.println("Price: $" + price);
    }
}
