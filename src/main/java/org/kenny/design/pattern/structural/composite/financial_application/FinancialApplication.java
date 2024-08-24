package org.kenny.design.pattern.structural.composite.financial_application;

public class FinancialApplication {
    public static void main(String[] args) {
        Portfolio portfolio = new Portfolio("Investment Portfolio");

        FinancialElement stock = new FinancialInstrument("AAPL", 1500.0, 0.2);
        FinancialElement bond = new FinancialInstrument("Government Bond", 2000.0, 0.1);

        portfolio.addElement("AAPL", stock);
        portfolio.addElement("Bond", bond);

        portfolio.display();

        // Track performance
        double currentPriceAAPL = 1600.0;
        double currentPriceBond = 2050.0;

        portfolio.trackPerformance(currentPriceAAPL);
        portfolio.trackPerformance(currentPriceBond);

        // Simulate investment strategy over 30 days
        double[] priceHistory = {1600.0, 1620.0, 1618.0, 1635.0, 1628.0, 1610.0, 1605.0, 1598.0, 1602.0, 1595.0,
                1588.0, 1565.0, 1570.0, 1575.0, 1580.0, 1578.0, 1585.0, 1590.0, 1595.0, 1600.0,
                1610.0, 1615.0, 1620.0, 1630.0, 1628.0, 1632.0, 1635.0, 1640.0, 1645.0, 1650.0};

        double finalValue = portfolio.simulateInvestment(30, priceHistory);
        System.out.println("Final Portfolio Value after 30 days: $" + finalValue);

        // Rebalance the portfolio
        double[] targetPercentages = {0.6, 0.4}; // Assuming 60% stocks and 40% bonds
        portfolio.rebalancePortfolio(targetPercentages);


        // Add goals to the portfolio
        portfolio.addGoal("Retirement", 1000000);
        portfolio.addAmountToGoal("Retirement", 50000);
        portfolio.addGoal("House Purchase", 500000);
        portfolio.addAmountToGoal("House Purchase", 25000);

        // Display goals
        portfolio.displayGoals();
    }
}
