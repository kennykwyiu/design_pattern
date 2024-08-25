package org.kenny.design.pattern.structural.composite.financial_application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Portfolio implements FinancialElement {
    private String name;
    private Map<String, FinancialElement> elements = new HashMap<>();
    private List<Goal> goals = new ArrayList<>();
    private List<News> newsList = new ArrayList<>();
    private List<MarketUpdate> marketUpdates = new ArrayList<>();

    public Portfolio(String name) {
        this.name = name;
    }

    public void addGoal(String name, double targetAmount) {
        goals.add(new Goal(name, targetAmount));
    }

    public void addAmountToGoal(String goalName, double amount) {
        for (Goal goal : goals) {
            if (goal.getName().equals(goalName)) {
                goal.addAmount(amount);
                break;
            }
        }
    }

    public void displayGoals() {
        System.out.println("Goals for Portfolio: " + name);
        for (Goal goal : goals) {
            goal.display();
        }
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

    @Override
    public double simulateInvestment(int days, double[] priceHistory) {
        double totalReturn = 0;
        for (int i = 0; i < days; i++) {
            for (FinancialElement element : elements.values()) {
                element.trackPerformance(priceHistory[i]);
            }
        }
        return calculateValue();
    }

    @Override
    public void rebalancePortfolio(double[] targetPercentages) {
        double totalValue = calculateValue();
        for (FinancialElement element : elements.values()) {
            double targetValue = totalValue * targetPercentages[0];  // Assuming rebalancing for one asset
            double currentValue = element.calculateValue();
            double adjustment = targetValue - currentValue;
            // Perform actual rebalancing actions here
            System.out.println("Rebalancing " + element + " by " + adjustment);
        }
    }

    public void addNews(News news) {
        newsList.add(news);
    }

    public void addMarketUpdate(MarketUpdate update) {
        marketUpdates.add(update);
    }

    public void displayNews() {
        System.out.println("Latest News:");
        for (News news : newsList) {
            news.display();
        }
    }

    public void displayMarketUpdates() {
        System.out.println("Market Updates:");
        for (MarketUpdate update : marketUpdates) {
            update.display();
        }
    }
}

