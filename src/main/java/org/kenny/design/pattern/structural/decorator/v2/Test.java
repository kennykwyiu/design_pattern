package org.kenny.design.pattern.structural.decorator.v2;

public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);

        System.out.println(aBattercake.getDesc() + " selling price: " + aBattercake.cost());

        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc() + " selling price: " + aBattercake.cost());


    }
}
