package org.kenny.design.pattern.structural.composite.financial_application;

import java.util.ArrayList;
import java.util.List;

public class PortfolioGroup implements FinancialElement {
    private String name;
    private List<FinancialElement> portfolios = new ArrayList<>();

    public PortfolioGroup(String name) {
        this.name = name;
    }

    public void addPortfolio(FinancialElement portfolio) {
        portfolios.add(portfolio);
    }

    @Override
    public void display() {
        System.out.println("Portfolio Group: " + name);
        for (FinancialElement portfolio : portfolios) {
            portfolio.display();
        }
    }

    @Override
    public double calculateValue() {
        double totalValue = 0;
        for (FinancialElement portfolio : portfolios) {
            totalValue += portfolio.calculateValue();
        }
        return totalValue;
    }

    @Override
    public void trackPerformance(double price) {

    }

    @Override
    public double calculateRisk() {
        return 0;
    }

    @Override
    public double simulateInvestment(int days, double[] priceHistory) {
        return 0;
    }
}
