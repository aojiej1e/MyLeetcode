package interview0617;

import java.util.Arrays;

/**
 * @author aojie
 * @Function
 * @create 2024-07-04 17:32
 */
public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            if (nums[left] == target && nums[right] == target) {
                return new int[]{left, right};
            }
            if (nums[left] == target) {
                right--;
            }else if (nums[right] == target){
                left++;
            }else {
                left++;
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
