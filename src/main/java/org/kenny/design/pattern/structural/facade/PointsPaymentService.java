package org.kenny.design.pattern.structural.facade;

public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift) {
        // deduct gift points logic
        System.out.println("pay gift points for " + pointsGift.getName() + " successfully");
        return true;
    }
}
