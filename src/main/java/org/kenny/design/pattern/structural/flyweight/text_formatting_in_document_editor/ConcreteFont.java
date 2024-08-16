package org.kenny.design.pattern.structural.flyweight.text_formatting_in_document_editor;

public class ConcreteFont implements Font {
    private String name;
    private int size;
    private String style;

    public ConcreteFont(String name, int size, String style) {
        this.name = name;
        this.size = size;
        this.style = style;
    }

    public void applyFont() {
        System.out.println("Applying font: " + name + ", Size: " + size + ", Style: " + style);
    }
}
