import java.util.*;

class EvaluateReversePolish {

    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            // if number → push
            if (!token.equals("+") &&
                !token.equals("-") &&
                !token.equals("*") &&
                !token.equals("/")) {

                stack.push(Integer.parseInt(token));
            }

            // operator case
            else {

                int b = stack.pop();
                int a = stack.pop();

                switch (token) {

                    case "+":
                        stack.push(a + b);
                        break;

                    case "-":
                        stack.push(a - b);
                        break;

                    case "*":
                        stack.push(a * b);
                        break;

                    case "/":
                        stack.push(a / b);
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        String[] tokens = {"2", "1", "+", "3", "*"};

        System.out.println(evalRPN(tokens)); // 9
    }
}