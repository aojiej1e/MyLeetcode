package interview0517.dp;

/**
 * @author aojie
 * @Function
 * @create 2024-06-07 14:16
 */
public class Fib {
    public static void main(String[] args) {

    }

    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
