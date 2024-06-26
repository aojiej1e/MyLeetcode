package problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * @author aojie
 * @Function
 * @create 2022-11-01 22:02
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
        if (minStack.size() == 0 || minStack.peek() >= val) {
            minStack.push(val);
        }
    }

    public void pop() {
        Integer pop = normalStack.pop();
        Integer minPop = minStack.peek();
        if (pop != null && pop.equals(minPop)) {
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
