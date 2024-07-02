package org.kenny.design.pattern.structural.decorator.v2;

public class EggDecorator extends AbstractDecorator{
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " add an egg";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
