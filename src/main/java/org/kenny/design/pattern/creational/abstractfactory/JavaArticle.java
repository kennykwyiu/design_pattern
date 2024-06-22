package org.kenny.design.pattern.creational.abstractfactory;

public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("Create Java article");
    }
}
