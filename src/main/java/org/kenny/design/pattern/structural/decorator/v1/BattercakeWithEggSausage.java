package org.kenny.design.pattern.structural.decorator.v1;

public class BattercakeWithEggSausage extends BattercakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc() + " with a sausage";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
