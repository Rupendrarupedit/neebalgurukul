package Day15HomeWork;


import java.util.Stack;

public class assign2PostfixToInfixConverter {

    public static String postfixToInfix(String expression) {
        Stack<String> stack = new Stack<>();
        String operators = "+-*/^";

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else if (operators.contains(String.valueOf(c))) {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                stack.push("(" + operand1 + c + operand2 + ")");
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String postfixExpression = "AB^C*D-EF/GH+/+";
        String infixExpression = postfixToInfix(postfixExpression);
        System.out.println("Infix Expression: " + infixExpression);
    }
}
