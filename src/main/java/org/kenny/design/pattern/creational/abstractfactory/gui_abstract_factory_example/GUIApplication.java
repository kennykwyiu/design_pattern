package org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example;

import org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.button.Button;
import org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.checkbox.Checkbox;
import org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.gui_theme_factory.DarkThemeFactory;
import org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.gui_theme_factory.GUIFactory;
import org.kenny.design.pattern.creational.abstractfactory.gui_abstract_factory_example.gui_theme_factory.LightThemeFactory;

/**
 * The GUIFactory interface defines methods for creating buttons and checkboxes.
 * LightThemeFactory and DarkThemeFactory are concrete factories that create light and dark themed GUI components.
 * Button and Checkbox are abstract product interfaces.
 * LightButton, DarkButton, LightCheckbox, and DarkCheckbox are concrete implementations of the button and checkbox interfaces.
 * GUIApplication acts as the client code that uses the abstract factory to create UI components based on the selected theme.
 */
public class GUIApplication {
    private GUIFactory factory;

    public GUIApplication(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }

    public static void main(String[] args) {
        GUIApplication lightApp = new GUIApplication(new LightThemeFactory());
        lightApp.createUI();

        GUIApplication darkApp = new GUIApplication(new DarkThemeFactory());
        darkApp.createUI();
    }
}
