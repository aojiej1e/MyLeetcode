package interview0517.simulate;

/**
 * @author aojie
 * @Function
 * @create 2024-05-31 15:11
 */
public class GenerateMatrix {
    public static void main(String[] args) {

    }
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int index = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = index;
                index++;
            }
        }
        return res;
    }
}
