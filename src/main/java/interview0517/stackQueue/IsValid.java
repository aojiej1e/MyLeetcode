package interview0517.stackQueue;

import java.util.Stack;

/**
 * @author aojie
 * @Function
 * @create 2024-05-17 18:21
 */
public class IsValid {
    public static void main(String[] args) {
        System.out.println(new IsValid().isValid("([)"));
    }

    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        Stack<Character> characterStack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ')' || charArray[i] == ']' || charArray[i] == '}') {
                if (!characterStack.isEmpty() && characterStack.peek().equals(getLeftBracket(charArray[i]))) {
                    characterStack.pop();
                } else {
                    return false;
                }
            }else {
                characterStack.push(charArray[i]);
            }
        }
        return characterStack.isEmpty();

    }

    private Character getLeftBracket(char c) {
        if (c == ')'){
         return '(';
        }else if (c == ']'){
            return '[';
        }else {
            return '{';
        }
    }
}
