package interview0517.dp;

/**
 * @author aojie
 * @Function
 * @create 2024-06-11 18:05
 */
public class Rob {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], nums[1]);
        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return Math.max(dp[len - 1], dp[len - 2]);
    }
}
