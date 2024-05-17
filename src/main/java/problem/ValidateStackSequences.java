package problem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2022-11-03 21:24
 */
public class ValidateStackSequences {
    public static void main(String[] args) {
        int[] pushed = {1, 2, 3, 4, 5};
        int[] popped = {4, 5, 3, 2, 1};
        System.out.println(new ValidateStackSequences().validateStackSequences(pushed, popped));
    }

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length <= 1) {
            return true;
        }
        List<Integer> pushList = new ArrayList<>();
        int index = 0;
        for (int pop : popped) {
            if (pushList.contains(pop) && pushList.get(pushList.size() - 1) != pop) {
                return false;
            }
            if (pushList.size() != 0 && pushList.get(pushList.size() - 1) == pop) {
                pushList.remove(pushList.size() - 1);
            }else {
                for (int i = index; i < pushed.length; i++) {
                    if (pop == pushed[i]) {
                        index++;
                        break;
                    }else {
                        pushList.add(pushed[i]);
                        index++;
                    }

                }
            }
        }
        return true;
    }
}
