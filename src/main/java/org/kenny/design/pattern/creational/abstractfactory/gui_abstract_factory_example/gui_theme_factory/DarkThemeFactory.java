package org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.gui_theme_factory;

import org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.button.Button;
import org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.button.DarkButton;
import org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.checkbox.Checkbox;
import org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.checkbox.DarkCheckbox;

public class DarkThemeFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}

