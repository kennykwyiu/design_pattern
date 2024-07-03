package org.kenny.design.pattern.structural.adapter.objectadapter;


public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("the method from concreteTarget");
    }
}
