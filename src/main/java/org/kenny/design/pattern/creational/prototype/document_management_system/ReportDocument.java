package org.kenny.design.pattern.creational.prototype.document_management_system;

public class ReportDocument implements DocumentPrototype {
    private String type;

    public ReportDocument(String type) {
        this.type = type;
    }

    @Override
    public DocumentPrototype clone() {
        return new ReportDocument(this.type);
    }

    @Override
    public void displayInfo() {
        System.out.println("Report Document: " + type);
    }
}
