package interview0617;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-06-21 14:48
 */
public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowMax = matrix.length;
        int colMax = matrix[0].length;
        int count = rowMax * colMax;
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int index = 0;
        ArrayList<Integer> result = new ArrayList<>();
        boolean[][] flags = new boolean[rowMax][colMax];
        int row = 0;
        int col = 0;
        for (int i = 0; i < count; i++) {
            result.add(matrix[row][col]);
            flags[row][col] = false;
            int nextRow = row + direction[index][0];
            int nextCol = col + direction[index][1];
            if (nextRow < 0 || nextRow >= rowMax || nextCol < 0 || nextCol >= colMax || flags[nextRow][nextCol]) {
                index++;
                index = index % 4;
            }
            row += direction[index][0];
            col += direction[index][1];
        }
        return result;
    }
}
