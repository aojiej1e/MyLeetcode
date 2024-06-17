package interview0517.dp;

/**
 * @author aojie
 * @Function
 * @create 2024-06-14 16:57
 */
public class NthUglyNumber {
    public static void main(String[] args) {

    }
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 1; i < n; i++) {
            int tempA = dp[a] * 2;
            int tempB = dp[b] * 3;
            int tempC = dp[c] * 5;
            dp[i] = Math.min(Math.min(tempA, tempB), tempC);
            if (dp[i] == tempA) {
                a++;
            }
            if (dp[i] == tempB) {
                b++;
            }
            if (dp[i] == tempC) {
                c++;
            }
        }
        return dp[n - 1];
    }
}
