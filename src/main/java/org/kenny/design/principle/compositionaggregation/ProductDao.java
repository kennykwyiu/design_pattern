package org.kenny.design.principle.compositionaggregation;

public class ProductDao extends DBConnection {
    public void addProduct() {
        String conn = super.getConnection();
        System.out.println("use " + conn + " add new product");
    }
}
