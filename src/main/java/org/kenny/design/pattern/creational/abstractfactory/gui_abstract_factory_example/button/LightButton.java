package org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.button;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a light button.");
    }
}
