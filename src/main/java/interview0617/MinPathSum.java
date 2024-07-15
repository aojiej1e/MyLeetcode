package interview0617;

/**
 * @author aojie
 * @Function
 * @create 2024-07-15 14:08
 */
public class MinPathSum {
    public static void main(String[] args) {

    }
    public int minPathSum(int[][] grid) {
        int rowMax = grid.length;
        int colMax = grid[0].length;
        int[][] dp = new int[rowMax][colMax];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < rowMax; i++) {
            dp[i][0] = grid[i][0] + dp[i - 1][0];
        }
        for (int i = 1; i < colMax; i++) {
            dp[0][i] = grid[0][i] + dp[0][i - 1];
        }
        for (int i = 1; i < rowMax; i++) {
            for (int j = 1; j < grid[i].length; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[rowMax - 1][colMax - 1];

    }
}
