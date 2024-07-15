package interview0617;

/**
 * @author aojie
 * @Function
 * @create 2024-06-19 18:05
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int[] dp = new int[length];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0] + nums[1], nums[1]);
        int max = Math.max(dp[0], dp[1]);
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
