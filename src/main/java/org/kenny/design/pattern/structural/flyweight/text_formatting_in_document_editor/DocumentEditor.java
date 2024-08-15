package org.kenny.design.pattern.structural.flyweight.text_formatting_in_document_editor;

public class DocumentEditor {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Font font1 = fontFactory.getFont("Arial", 12, "Bold");
        Font font2 = fontFactory.getFont("Arial", 12, "Bold");

        font1.applyFont(); // Same Font object as font2 is shared
        font2.applyFont();
    }
}
