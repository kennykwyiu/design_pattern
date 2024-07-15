package org.kenny.design.pattern.behavioral.interpreter;

public class OperatorUtil {
    public static boolean isOperator(String symbol) {
        return symbol.equals("+") || symbol.equals("*");
    }
}
