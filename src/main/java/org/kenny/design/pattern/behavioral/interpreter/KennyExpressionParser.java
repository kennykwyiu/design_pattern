package org.kenny.design.pattern.behavioral.interpreter;

import java.util.Stack;

public class KennyExpressionParser {
    private Stack<Interpreter> stack = new Stack<>();

    public int parse(String str) {
        String[] strItemArray = str.split(" ");
        for (String symbol : strItemArray) {
            if (!OperatorUtil.isOperator(symbol)) {
                Interpreter numberExpression = new NumberInterpreter(symbol);
                stack.push(numberExpression);
                System.out.println(String.format("push into stack: %d", numberExpression.interpret()));
            } else {
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println(String.format("pop out from stack: %d and %d", firstExpression.interpret(), secondExpression.interpret()));

                Interpreter operator = OperatorUtil.getExpressionObject(firstExpression, secondExpression, symbol);
                System.out.println(String.format("operator: %s", operator));

                int result = operator.interpret();
                NumberInterpreter resultExpression = new NumberInterpreter(result);
                stack.push(resultExpression);
                System.out.println(String.format("first stage result: %d", resultExpression.interpret()));
            }
        }
        int result = stack.pop().interpret();
        return  result;
    }
}
