package interview0517.backTracke;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-06-05 15:30
 */
public class PermuteUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> singleList = new LinkedList<>();
        backTrace(nums, result, singleList, new boolean[nums.length]);
        return result;
    }

    private void backTrace(int[] nums, ArrayList<List<Integer>> result, LinkedList<Integer> singleList, boolean[] booleans) {
        if (singleList.size() == nums.length) {
            result.add(new ArrayList<>(singleList));
            return;
        }
        ArrayList<Integer> noRepeatList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!booleans[i] && !noRepeatList.contains(nums[i])) {
                noRepeatList.add(nums[i]);
                booleans[i] = true;
                singleList.add(nums[i]);
                backTrace(nums, result, singleList, booleans);
                booleans[i] = false;
                singleList.removeLast();
            }
        }
    }
}
