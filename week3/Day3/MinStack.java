import java.util.*;

class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int value) {
        stack.push(value);

        if (minStack.isEmpty()) {
            minStack.push(value);
        } else {
            minStack.push(Math.min(value, minStack.peek()));
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

public class MinStack {
    public static void main(String[] args) {

        MinStack st = new MinStack();

        st.push(5);
        st.push(2);
        st.push(8);
        st.push(1);

        System.out.println("Top: " + st.top());      
        System.out.println("Min: " + st.getMin());   

        st.pop();

        System.out.println("Top: " + st.top());      
        System.out.println("Min: " + st.getMin());   
    }
}
