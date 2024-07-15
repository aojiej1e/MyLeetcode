package interview0617;

import java.util.Arrays;

/**
 * @author aojie
 * @Function
 * @create 2024-07-12 14:01
 */
public class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        dp[0] = 1;
        dp[1] = nums[1] > nums[0] ? dp[0] + 1 : 1;
        int max = Math.max(dp[0], dp[1]);
        for (int i = 2; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
