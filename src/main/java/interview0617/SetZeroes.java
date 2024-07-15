package interview0617;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author aojie
 * @Function
 * @create 2024-06-20 18:18
 */
public class SetZeroes {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        boolean[] zeroRowFlags = new boolean[row];
        boolean[] zeroColFlags = new boolean[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    zeroRowFlags[i] = true;
                    zeroColFlags[j] = true;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (zeroRowFlags[i] || zeroColFlags[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
}
