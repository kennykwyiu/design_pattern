package org.kenny.design.principle.interfacesegregation;

public class Dog implements IAnimalAction {
    @Override
    public void eat() {

    }

    @Override
    public void fly() {
        // Dog cannot fly
    }

    @Override
    public void swim() {

    }
}
