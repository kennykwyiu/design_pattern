package org.kenny.design.pattern.behavioral.strategy;

public class BuyOneGetOneFreePromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("Buy one get one free - can buy one get one free");
    }
}
