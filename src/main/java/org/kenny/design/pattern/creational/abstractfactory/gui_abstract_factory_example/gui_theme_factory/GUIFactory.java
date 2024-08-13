package org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.gui_theme_factory;

import org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.button.Button;
import org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
