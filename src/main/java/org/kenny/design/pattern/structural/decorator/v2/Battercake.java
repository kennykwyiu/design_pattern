package org.kenny.design.pattern.structural.decorator.v2;

public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "Battercake";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
