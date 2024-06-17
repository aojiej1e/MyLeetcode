package interview0517.dp;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author aojie
 * @Function
 * @create 2024-06-13 13:39
 */
public class LengthOfLIS {
    public static void main(String[] args) {
    }
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return 1;
        }
        int[] dp = new int[len];
        Arrays.fill(dp, 1);
        dp[1] = nums[1] > nums[0] ?  dp[0] + 1 : 1;
        int max = Math.max(dp[0], dp[1]);
        for (int i = 2; i < len; i++) {
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
