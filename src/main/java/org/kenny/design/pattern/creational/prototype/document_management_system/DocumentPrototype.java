package org.kenny.design.pattern.creational.prototype.document_management_system;

public interface DocumentPrototype {
    DocumentPrototype clone();
    void displayInfo();
}
