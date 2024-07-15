package interview0617;

/**
 * @author aojie
 * @Function
 * @create 2024-07-09 18:40
 */
public class Jump {
    public static void main(String[] args) {

    }
    public int jumpGreedy(int[] nums) {
        int len = nums.length - 1;
        int step = 0;
        while (len > 0) {
            for (int i = 0; i < len; i++) {
                if (i + nums[i] >= len) {
                    len = i;
                    step ++;
                    break;
                }
            }
        }
        return step;
    }

    public int jumpDP(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (j + nums[j] >= i) {
                    dp[i] = j;
                }
            }
        }
        return dp[nums.length - 1];
    }
}
