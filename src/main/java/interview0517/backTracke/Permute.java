package interview0517.backTracke;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-06-05 15:23
 */
public class Permute {
    public static void main(String[] args) {

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        LinkedList<Integer> singleList = new LinkedList<>();
        backTrace(nums, list, singleList, new boolean[nums.length]);
        return list;
    }

    private void backTrace(int[] nums, List<List<Integer>> list, LinkedList<Integer> singleList, boolean[] booleans) {
        if (singleList.size() == nums.length) {
            list.add(new ArrayList<>(singleList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!booleans[i]) {
                booleans[i] = true;
                singleList.add(nums[i]);
                backTrace(nums, list, singleList, booleans);
                booleans[i] = false;
                singleList.removeLast();
            }
        }
    }
}
