package interview0617;

import java.util.Stack;

/**
 * @author aojie
 * @Function
 * @create 2024-07-05 15:08
 */
public class IsValid {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }else if(c == ')'){
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.pop()!= '(') {
                    return false;
                }
            }else if (c == ']'){
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.pop() != '[') {
                    return false;
                }
            }else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.pop() != '{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
