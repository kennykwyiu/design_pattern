package org.kenny.design.pattern.structural.composite.financial_application;

public class News {
    private String headline;
    private String content;

    public News(String headline, String content) {
        this.headline = headline;
        this.content = content;
    }

    public void display() {
        System.out.println("Headline: " + headline);
        System.out.println("Content: " + content);
    }
}
