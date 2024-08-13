package org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.gui_theme_factory;

import org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.button.Button;
import org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.button.LightButton;
import org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.checkbox.Checkbox;
import org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.checkbox.LightCheckbox;

public class LightThemeFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
