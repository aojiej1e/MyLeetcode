package interview0617;

/**
 * @author aojie
 * @Function
 * @create 2024-06-18 17:00
 */
public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        if (len < k) {
            return null;
        }
        int[] result = new int[len - k + 1];
        for (int i = 0; i <= len - k; i++) {
            if (i == 0 || result[i - 1] == nums[i - 1]) {
                int max = nums[i];
                for (int j = i + 1; j < i + k; j++) {
                    max = Math.max(max, nums[j]);
                }
                result[i] = max;
            } else {
                result[i] = Math.max(result[i - 1], nums[i + k - 1]);
            }
        }
        return result;
    }
}
