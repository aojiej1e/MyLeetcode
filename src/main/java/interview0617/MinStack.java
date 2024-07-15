package interview0617;

import java.util.Stack;

/**
 * @author aojie
 * @Function
 * @create 2024-07-05 15:51
 */
public class MinStack {

    Stack<Integer> stack;

    Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || minStack.peek() >= val) {
            minStack.push(val);
        }
    }

    public void pop() {
        Integer pop = stack.pop();

        Integer peek = minStack.peek();
        if (peek != null && peek.equals(pop) ) {
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
