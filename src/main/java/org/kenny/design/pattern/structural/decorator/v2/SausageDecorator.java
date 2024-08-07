package org.kenny.design.pattern.structural.decorator.v2;

public class SausageDecorator extends AbstractDecorator{
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {
        // if have some business logic in each case, can add it here
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " add a sausage";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
