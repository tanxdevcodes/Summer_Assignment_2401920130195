import java.util.ArrayDeque;
import java.util.Deque;

class MyQueue {
    private Deque<Integer> in_stk = new ArrayDeque<>();
    private Deque<Integer> out_stk = new ArrayDeque<>();

    
    public void push(int x) {
        in_stk.push(x);
    }

    
    public int pop() {
        peek();
        return out_stk.pop();
    }

    
    public int peek() {
        if (out_stk.isEmpty()) {
            while (!in_stk.isEmpty()) {
                out_stk.push(in_stk.pop());
            }
        }
        return out_stk.peek();
    }

    
    public boolean empty() {
        return in_stk.isEmpty() && out_stk.isEmpty();
    }
}

public class ImplementQueueUsingStack {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();

        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println(q.peek());   // 1
        System.out.println(q.pop());    // 1
        System.out.println(q.empty());  // false
    }
}
