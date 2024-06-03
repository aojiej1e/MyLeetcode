package interview0517.simulate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-05-31 15:40
 */
public class SpiralOrder {
    public static void main(String[] args) {
        int[][] req = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(new SpiralOrder().spiralOrder(req));
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int rowMax = matrix.length;
        int colMax = matrix[0].length;
        boolean[][] flag = new boolean[rowMax][colMax];
        int count = rowMax * colMax;
        int[][] direction = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        List<Integer> result = new ArrayList<>();
        int directionIndex = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < count; i++) {
            result.add(matrix[row][col]);
            flag[row][col] = true;
            int nextRow = row + direction[directionIndex][0];
            int nextCol = col + direction[directionIndex][1];
            if (nextRow < 0 || nextCol < 0 || nextRow >= rowMax || nextCol >= colMax || flag[nextRow][nextCol]) {
                directionIndex++;
                directionIndex %= 4;
            }
            row = row + direction[directionIndex][0];;
            col = col + direction[directionIndex][1];;
        }
        return result;
    }
}
