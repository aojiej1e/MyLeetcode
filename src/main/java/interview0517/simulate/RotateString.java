package interview0517.simulate;

/**
 * @author aojie
 * @Function
 * @create 2024-05-31 14:30
 */
public class RotateString {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        int len = s.length();
        char startChar = s.charAt(0);
        int goalIndex = goal.length() - 1;
        while (goalIndex >= 0) {
            if (startChar == goal.charAt(goalIndex)) {
                //前后比较
                if (s.substring(0, len - goalIndex).equals(goal.substring(goalIndex, len)) && s.substring(len - goalIndex, len).equals(goal.substring(0, goalIndex))) {
                    return true;
                }
            }
            goalIndex--;
        }
        return false;

    }
}
