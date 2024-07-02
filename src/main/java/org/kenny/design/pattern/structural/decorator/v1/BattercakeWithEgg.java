package org.kenny.design.pattern.structural.decorator.v1;

public class BattercakeWithEgg extends Battercake {
    @Override
    public String getDesc() {
        return super.getDesc() + " with a fried egg";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
