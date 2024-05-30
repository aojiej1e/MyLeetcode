package interview0517.stackQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author aojie
 * @Function
 * @create 2024-05-28 18:46
 */
public class MinStack {

    private Stack<Integer> normalStack;

    private Stack<Integer> minStack;

    public MinStack() {
        normalStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        normalStack.push(val);
        if (minStack.isEmpty() || minStack.peek() >= val) {
            minStack.push(val);
        }
    }

    public void pop() {
        Integer pop = normalStack.pop();
        Integer peek = minStack.peek();
        if (pop != null && pop.equals(peek)) {
            minStack.pop();
        }
    }

    public int top() {
       return normalStack.peek();
    }

    public int getMin() {
       return minStack.peek();
    }
}
