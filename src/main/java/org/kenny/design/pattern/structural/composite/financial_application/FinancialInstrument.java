package org.kenny.design.pattern.structural.composite.financial_application;

public class FinancialInstrument implements FinancialElement {
    private String name;
    private double value;
    private double performance;
    private double volatility;

    public FinancialInstrument(String name, double value, double volatility) {
        this.name = name;
        this.value = value;
        this.performance = 0.0;
        this.volatility = volatility;
    }

    @Override
    public void display() {
        System.out.println("Value: $" + value + " - Performance: " + performance + " - Volatility: " + volatility);
    }

    @Override
    public double calculateValue() {
        return value;
    }

    @Override
    public void trackPerformance(double price) {
        performance = ((price - value) / value) * 100;
        System.out.println("Tracking performance for " + name + ": " + performance + "%");
    }

    @Override
    public double calculateRisk() {
        return volatility;
    }

}

