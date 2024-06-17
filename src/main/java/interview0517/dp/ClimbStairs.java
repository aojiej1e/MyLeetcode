package interview0517.dp;

/**
 * @author aojie
 * @Function
 * @create 2024-06-07 14:28
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
