package org.kenny.design.pattern.behavioral.strategy;

public class CashCouponPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("Cash coupon - can deduct the product price directly");
    }
}
