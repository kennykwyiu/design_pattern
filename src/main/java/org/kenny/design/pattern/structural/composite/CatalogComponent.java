package org.kenny.design.pattern.structural.composite;

public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("don't support add operation");
    }

    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("don't support remove operation");
    }

    public String getName(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("don't support getName operation");
    }

    public double getPrice(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("don't support getPrice operation");
    }

    public void print(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException("don't support print operation");
    }
}
