package org.kenny.design.pattern.structural.composite.financial_application;

public interface FinancialElement {
    void display();
    double calculateValue();
    void trackPerformance(double price);
}
