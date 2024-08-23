package org.kenny.design.pattern.structural.composite.financial_application;

public class FinancialApplication {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio("Investment Portfolio");

        FinancialElement stock = new FinancialInstrument("AAPL", 1500.0);
        FinancialElement bond = new FinancialInstrument("Government Bond", 2000.0);

        portfolio.addElement("AAPL", stock);
        portfolio.addElement("Bond", bond);

        portfolio.display();

        // Track performance
        double currentPriceAAPL = 1600.0;
        double currentPriceBond = 2050.0;

        portfolio.trackPerformance(currentPriceAAPL);
        portfolio.trackPerformance(currentPriceBond);
    }
}
