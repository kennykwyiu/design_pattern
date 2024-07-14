package org.kenny.design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();
    static  {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASH_REBATE, new CashRebatePromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASH_COUPON, new CashCouponPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.BUY_ONE_GET_ONE_FREE, new BuyOneGetOneFreePromotionStrategy());
    }

    private static final PromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();

    private PromotionStrategyFactory() {

    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
    }

    private interface PromotionKey {
        String CASH_REBATE = "CASH_REBATE";
        String CASH_COUPON = "CASH_COUPON";
        String BUY_ONE_GET_ONE_FREE = "BUY_ONE_GET_ONE_FREE";
    }
}
