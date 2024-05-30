package interview0517.stackQueue;

import org.checkerframework.checker.units.qual.C;

import java.util.Stack;

/**
 * @author aojie
 * @Function
 * @create 2024-05-29 13:58
 */
public class DecodeString {
    public static void main(String[] args) {
        System.out.println(new DecodeString().decodeString("3[a2[c]]"));
    }
    public String decodeString(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char c : charArray) {
            if (c != ']') {
                stack.push(c);
            }else {
                StringBuilder tempSb = new StringBuilder();
                while (!stack.isEmpty() && Character.isAlphabetic(stack.peek())) {
                    tempSb.insert(0, stack.pop());
                }
                stack.pop();
                StringBuilder countSb = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    countSb.insert(0, stack.pop());
                }
                int count = Integer.parseInt(countSb.toString());
                for (int i = 0; i < count; i++) {
                    for (char c1 : tempSb.toString().toCharArray()) {
                        stack.push(c1);
                    }
                }
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
