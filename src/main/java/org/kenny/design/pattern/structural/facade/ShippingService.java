package org.kenny.design.pattern.structural.facade;

public class ShippingService {
    public String shipGift(PointsGift pointsGift) {
        // logic to ship the gift
        System.out.println(pointsGift.getName() + " was shipped to logistic system");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
