package org.kenny.design.pattern.creational.prototype.document_management_system;

public class PrototypeExample {
    public static void main(String[] args) {
        DocumentManager documentManager = new DocumentManager();

        DocumentPrototype report = documentManager.createDocument("report");
        report.displayInfo();

        DocumentPrototype presentation = documentManager.createDocument("presentation");
        presentation.displayInfo();
    }
}
