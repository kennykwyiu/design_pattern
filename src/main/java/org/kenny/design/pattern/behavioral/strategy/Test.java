package org.kenny.design.pattern.behavioral.strategy;

import org.apache.commons.lang3.StringUtils;

public class Test {
//    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new BuyOneGetOneFreePromotionStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new CashRebatePromotionStrategy());
//
//        promotionActivity618.executePromotionStrategy();
//        promotionActivity1111.executePromotionStrategy();
//    }

    public static void main(String[] args) {
        PromotionActivity promotionActivity = null;
        String promotionKey = "CashCoupon";

        if (StringUtils.equals(promotionKey, "CashCoupon")) {
            promotionActivity = new PromotionActivity(new CashCouponPromotionStrategy());
        } else if (StringUtils.equals(promotionKey, "CashRebate")) {
            promotionActivity = new PromotionActivity(new CashRebatePromotionStrategy());
        } else if (StringUtils.equals(promotionKey, "BuyOneGetOneFree")) {
            promotionActivity = new PromotionActivity(new BuyOneGetOneFreePromotionStrategy());
        } //....

        promotionActivity.executePromotionStrategy();
    }

}
