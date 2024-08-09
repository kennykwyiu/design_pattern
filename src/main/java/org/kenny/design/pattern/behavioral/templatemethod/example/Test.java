package org.kenny.design.pattern.behavioral.templatemethod.example;

public class Test {
    public static void main(String[] args) {

        Game cricket = new Cricket();
        cricket.play();
        System.out.println();

        Game football = new Football();
        football.play();
    }
}
