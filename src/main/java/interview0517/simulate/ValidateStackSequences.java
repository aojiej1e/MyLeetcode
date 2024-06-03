package interview0517.simulate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-05-31 14:52
 */
public class ValidateStackSequences {
    public static void main(String[] args) {

    }
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        List<Integer> list = new ArrayList<>();
        int len = popped.length;
        int index = 0;
        for (int push : pushed) {
            //进栈
            list.add(push);
            while (!list.isEmpty() && index < len && popped[index] == list.get(list.size() - 1)) {
                //出栈
                list.remove(list.size() - 1);
                index++;
            }
        }
        return list.isEmpty();
    }
}
