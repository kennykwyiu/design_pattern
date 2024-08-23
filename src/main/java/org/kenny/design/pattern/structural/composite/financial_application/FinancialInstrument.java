package org.kenny.design.pattern.structural.composite.financial_application;

public class FinancialInstrument implements FinancialElement {
    private String name;
    private double value;
    private double performance;

    public FinancialInstrument(String name, double value) {
        this.name = name;
        this.value = value;
        this.performance = 0.0;
    }

    @Override
    public void display() {
        System.out.println("Value: $" + value + " - Performance: " + performance);
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

}

