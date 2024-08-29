package org.kenny.design.pattern.structural.bridge.e_commerce_platforms;

public class PointReward implements Reward {
    private int points;

    public PointReward(int points) {
        this.points = points;
    }

    @Override
    public void applyReward() {
        System.out.println("Reward applied: " + points + " points added to the user's account.");
    }
}
