package org.kenny.design.pattern.creational.abstractfactory;

public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("Creating Python article");
    }
}
