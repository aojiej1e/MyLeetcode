package interview0617;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author aojie
 * @Function
 * @create 2024-06-17 14:14
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = hashMap.get(target - nums[i]);
            if (index != null) {
                return new int[]{index, i};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }
}
