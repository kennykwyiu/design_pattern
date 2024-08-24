package org.kenny.design.pattern.structural.composite.financial_application;

public class Goal {
    private String name;
    private double targetAmount;
    private double currentAmount;

    public Goal(String name, double targetAmount) {
        this.name = name;
        this.targetAmount = targetAmount;
        this.currentAmount = 0.0;
    }

    public String getName() {
        return name;
    }

    public void addAmount(double amount) {
        currentAmount += amount;
    }

    public double getProgress() {
        return (currentAmount / targetAmount) * 100;
    }

    public void display() {
        System.out.println("Goal: " + name);
        System.out.println("Target Amount: $" + targetAmount);
        System.out.println("Current Amount: $" + currentAmount);
        System.out.println("Progress: " + getProgress() + "%");
    }
}
