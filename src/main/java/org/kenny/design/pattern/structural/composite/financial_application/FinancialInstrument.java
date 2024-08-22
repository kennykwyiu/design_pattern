package org.kenny.design.pattern.structural.composite.financial_application;

public class FinancialInstrument implements FinancialElement {
    private String name;
    private double value;

    public FinancialInstrument(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public void display() {
        System.out.println("Financial Instrument: " + name + " - Value: $" + value);
    }

    @Override
    public double calculateValue() {
        return value;
    }


}

