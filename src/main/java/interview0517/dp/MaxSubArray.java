package interview0517.dp;

/**
 * @author aojie
 * @Function
 * @create 2024-06-11 17:46
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0] + nums[1], nums[1]);
        int max = Math.max(dp[0], dp[1]);
        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
