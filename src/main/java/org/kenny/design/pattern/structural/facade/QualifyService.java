package org.kenny.design.pattern.structural.facade;

public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("Check whether the gift points and quantity of " + pointsGift.getName() + " is enough or not");
        return true;
    }
}
