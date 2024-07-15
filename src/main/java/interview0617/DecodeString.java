package interview0617;

import java.util.Stack;

/**
 * @author aojie
 * @Function
 * @create 2024-07-05 16:16
 */
public class DecodeString {
    public static void main(String[] args) {
        System.out.println(new DecodeString().decodeString("3[a]2[bc]"));
    }
    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : charArray) {
            if (c != ']') {
                stack.push(c);
                continue;
            }
            StringBuilder sb = new StringBuilder();
            while (stack.peek() != '[') {
                sb.insert(0,stack.pop());
            }
            stack.pop();
            StringBuilder countStr = new StringBuilder();
            while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                countStr.insert(0,stack.pop());
            }
            int count = Integer.parseInt(countStr.toString());
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < sb.length(); j++) {
                    stack.push(sb.charAt(j));
                }
            }
        }
        while (!stack.empty()) {
            result.insert(0, stack.pop());
        }
        return result.toString();
    }
}
