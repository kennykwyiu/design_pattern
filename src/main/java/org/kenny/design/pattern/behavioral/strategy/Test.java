package org.kenny.design.pattern.behavioral.strategy;

public class Test {
    public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new BuyOneGetOneFreePromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new CashRebatePromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();
    }
}
