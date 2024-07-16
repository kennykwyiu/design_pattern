package org.kenny.design.pattern.behavioral.interpreter;

public class Test {
    public static void main(String[] args) {
        String kennyInputStr = "6 100 11 + *";
        KennyExpressionParser kennyExpressionParser = new KennyExpressionParser();
        int result = kennyExpressionParser.parse(kennyInputStr );
        System.out.println("Parser operating result: " + result);
    }
}
