package org.kenny.design.pattern.behavioral.strategy;

public class CashRebatePromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("Cash rebate - rebate will be added to kenny web cash balance automatically");
    }
}
