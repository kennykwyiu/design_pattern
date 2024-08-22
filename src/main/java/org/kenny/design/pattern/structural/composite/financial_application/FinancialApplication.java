package org.kenny.design.pattern.structural.composite.financial_application;

public class FinancialApplication {
    public static void main(String[] args) {
        FinancialElement stock = new FinancialInstrument("AAPL", 1500.0);
        FinancialElement bond = new FinancialInstrument("Government Bond", 2000.0);

        Portfolio portfolio1 = new Portfolio("Investment Portfolio");
        portfolio1.addElement(stock);
        portfolio1.addElement(bond);

        FinancialElement gold = new FinancialInstrument("Gold ETF", 3000.0);
        Portfolio portfolio2 = new Portfolio("Retirement Portfolio");
        portfolio2.addElement(gold);

        PortfolioGroup portfolioGroup = new PortfolioGroup("All Portfolios");
        portfolioGroup.addPortfolio(portfolio1);
        portfolioGroup.addPortfolio(portfolio2);

        portfolioGroup.display();

        double totalValue = portfolioGroup.calculateValue();
        System.out.println("Total Value of All Portfolios: $" + totalValue);
    }
}
