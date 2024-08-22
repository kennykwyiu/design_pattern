package org.kenny.design.pattern.structural.composite.financial_application;

public class FinancialApplication {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio("Investment Portfolio");

        FinancialElement stock = new FinancialInstrument("AAPL");
        FinancialElement bond = new FinancialInstrument("Government Bond");

        portfolio.addElement(stock);
        portfolio.addElement(bond);

        portfolio.display();
    }
}
