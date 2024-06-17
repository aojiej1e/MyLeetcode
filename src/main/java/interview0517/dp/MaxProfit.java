package interview0517.dp;

/**
 * @author aojie
 * @Function
 * @create 2024-06-07 15:08
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
                maxProfit = Math.max(maxProfit, prices[i] - min);
                min = Math.min(min, prices[i]);
        }
        return maxProfit;

    }
}
