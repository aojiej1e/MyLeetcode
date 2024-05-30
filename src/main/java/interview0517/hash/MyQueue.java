package interview0517.hash;

import java.util.Stack;

/**
 * @author aojie
 * @Function
 * @create 2024-05-30 11:23
 */
public class MyQueue {

    private Stack<Integer> inStack;

    private Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
        int pop = outStack.pop();
        while (!outStack.isEmpty()) {
            inStack.push(outStack.pop());
        }
        return pop;
    }

    public int peek() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
        int peek = outStack.peek();
        while (!outStack.isEmpty()) {
            inStack.push(outStack.pop());
        }
        return peek;
    }

    public boolean empty() {
        return inStack.isEmpty();
    }
}
