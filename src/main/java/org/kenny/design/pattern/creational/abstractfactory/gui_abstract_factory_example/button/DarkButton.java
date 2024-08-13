package org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.button;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a dark button.");
    }
}
