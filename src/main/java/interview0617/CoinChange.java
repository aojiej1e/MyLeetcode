package interview0617;

import java.util.Arrays;

/**
 * @author aojie
 * @Function
 * @create 2024-07-11 13:48
 */
public class CoinChange {
    public static void main(String[] args) {
        System.out.println(new CoinChange().coinChange(new int[]{2, 3, 5, 10}, 10));
    }
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount ; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j] && dp[i - coins[j]] < Integer.MAX_VALUE) {
                    min = dp[i - coins[j]] + 1;
                }
            }
            dp[i] = min;
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}
