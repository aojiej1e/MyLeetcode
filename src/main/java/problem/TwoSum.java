package problem;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author aojie
 * @Function
 * @create 2024-02-23 22:05
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] req = {2,7,11,15};
        System.out.println(Arrays.toString(new TwoSum().twoSum(req, 9)));
    }
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = hashMap.get(target - nums[i]);
                return res;
            }
            hashMap.put(nums[i], i);
        }
        return res;
    }
}
