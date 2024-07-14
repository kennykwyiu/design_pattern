package org.kenny.design.pattern.behavioral.strategy;

public class EmptyPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("No promotion activity");
    }
}
