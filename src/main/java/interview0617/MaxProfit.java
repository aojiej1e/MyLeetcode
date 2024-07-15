package interview0617;

/**
 * @author aojie
 * @Function
 * @create 2024-07-09 17:28
 */
public class MaxProfit {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;

    }
}
