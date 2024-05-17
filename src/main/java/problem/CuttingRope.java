package problem;

/**
 * @author aojie
 * @Function
 * @create 2022-10-15 21:28
 */
public class CuttingRope {
    public static void main(String[] args) {
        CuttingRope cuttingRope = new CuttingRope();
        System.out.println(cuttingRope.cuttingRope(120));
    }

    int cuttingRope(int n) {
        long[] dp = new long[n + 1];
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], j * dp[i - j]) ;
            }
        }
        return (int) (dp[n] % 1000000007);
    }

}
