package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

public class PercentageDiscount implements Discount {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double amount) {
        return amount - (amount * percentage / 100);
    }
}
