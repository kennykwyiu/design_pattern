package org.kenny.design.pattern.structural.composite.financial_application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Portfolio implements FinancialElement {
    private String name;
    private Map<String, FinancialElement> elements = new HashMap<>();

    public Portfolio(String name) {
        this.name = name;
    }

    public void addElement(String symbol, FinancialElement element) {
        elements.put(symbol, element);
    }

    @Override
    public void display() {
        System.out.println("Portfolio: " + name);
        for (Map.Entry<String, FinancialElement> entry : elements.entrySet()) {
            System.out.print("Symbol: " + entry.getKey() + " - ");
            entry.getValue().display();
        }
    }

    @Override
    public double calculateValue() {
        double totalValue = 0;
        for (FinancialElement element : elements.values()) {
            totalValue += element.calculateValue();
        }
        return totalValue;
    }

    @Override
    public void trackPerformance(double price) {
        System.out.println("Tracking performance for Portfolio: " + name);
        for (FinancialElement element : elements.values()) {
            element.trackPerformance(price);
        }
    }

    @Override
    public double calculateRisk() {
        double totalRisk = 0;
        for (FinancialElement element : elements.values()) {
            totalRisk += element.calculateRisk();
        }
        return totalRisk / elements.size();
    }
}

