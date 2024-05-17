package problem;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author aojie
 * @Function
 * @create 2022-11-01 22:02
 */
public class MinStack {

    List<Integer> list;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public void pop() {
        list.remove(list.size() - 1);
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (Integer integer : list) {
            if (integer < min) {
                min = integer;
            }
        }
        return min;
    }
}
