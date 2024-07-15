package interview0617;

import java.util.Stack;

/**
 * @author aojie
 * @Function
 * @create 2024-07-08 15:12
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length - 1;
        int[] result = new int[len + 1];
        Stack<Integer> stack = new Stack<>();
        for (int i = len; i >= 0; i--) {
            int curr = temperatures[i];
            while (!stack.isEmpty() && curr > stack.peek()) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                result[i] =   stack.peek() - i;
            }
            stack.push(i);

        }
        return result;
    }
}
