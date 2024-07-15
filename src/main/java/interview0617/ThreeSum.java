package interview0617;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-06-17 17:23
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] + nums[i] > 0) {
                    right--;
                } else if (nums[left] + nums[right] + nums[i] < 0) {
                    left++;
                } else {
                    result.add(Arrays.asList(nums[left], nums[right], nums[i]));
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    left++;
                    right--;
                }
                left++;
                right--;

            }
        }
        return result;
    }
}
