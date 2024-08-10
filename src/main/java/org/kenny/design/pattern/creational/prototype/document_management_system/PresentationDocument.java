package org.kenny.design.pattern.creational.prototype.document_management_system;

public class PresentationDocument implements DocumentPrototype {
    private String type;

    public PresentationDocument(String type) {
        this.type = type;
    }

    @Override
    public DocumentPrototype clone() {
        return new PresentationDocument(this.type);
    }

    @Override
    public void displayInfo() {
        System.out.println("Presentation Document: " + type);
    }
}
