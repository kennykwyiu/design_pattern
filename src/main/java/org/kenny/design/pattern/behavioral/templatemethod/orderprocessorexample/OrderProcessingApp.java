package org.kenny.design.pattern.behavioral.templatemethod.orderprocessorexample;

public class OrderProcessingApp {
    public static void main(String[] args) {

        OrderProcessor onlineOrder = new OnlineOrderProcessor();
        System.out.println("Processing online order:");
        onlineOrder.processOrder();
        System.out.println();

        OrderProcessor inStoreOrder = new InStoreOrderProcessor();
        System.out.println("Processing in-store order:");
        inStoreOrder.processOrder();
    }
}
