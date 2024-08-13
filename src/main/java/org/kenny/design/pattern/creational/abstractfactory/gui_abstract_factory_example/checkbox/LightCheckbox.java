package org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.checkbox;

public class LightCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a light checkbox.");
    }
}
