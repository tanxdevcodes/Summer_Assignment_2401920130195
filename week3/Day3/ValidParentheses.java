import java.util.Stack;

class ValidParentheses {

    public static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            // opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else {
                // if stack empty → no matching opening
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.pop();

                // mismatch check
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // if stack empty → valid
        return st.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(isValid("()[]{}"));   // true
        System.out.println(isValid("(]"));       // false
        System.out.println(isValid("({[]})"));   // true
    }
}
