package org.kenny.design.pattern.structural.composite.financial_application;

import java.util.ArrayList;
import java.util.List;

public class Portfolio implements FinancialElement {
    private String name;
    private List<FinancialElement> elements = new ArrayList<>();

    public Portfolio(String name) {
        this.name = name;
    }

    public void addElement(FinancialElement element) {
        elements.add(element);
    }

    @Override
    public void display() {
        System.out.println("Portfolio: " + name);
        for (FinancialElement element : elements) {
            element.display();
        }
    }
}

