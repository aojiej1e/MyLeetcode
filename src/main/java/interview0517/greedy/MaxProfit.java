package interview0517.greedy;

/**
 * @author aojie
 * @Function
 * @create 2024-06-14 17:20
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int tempProfit = prices[i] - prices[i - 1];
            if (tempProfit > 0) {
                profit += tempProfit;
            }
        }
        return profit;
    }
}
