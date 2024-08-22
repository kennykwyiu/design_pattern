package org.kenny.design.pattern.structural.composite.financial_application;

public class FinancialInstrument implements FinancialElement {
    private String name;

    public FinancialInstrument(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Financial Instrument: " + name);
    }
}

