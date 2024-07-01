package org.kenny.design.pattern.structural.facade;

public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T-shirt");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.setQualifyService(new QualifyService());
        giftExchangeService.setPointsPaymentService(new PointsPaymentService());
        giftExchangeService.setShippingService(new ShippingService());

        giftExchangeService.giftExchange(pointsGift);
    }
}
