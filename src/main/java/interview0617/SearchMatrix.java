package interview0617;

/**
 * @author aojie
 * @Function
 * @create 2024-06-21 15:07
 */
public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowMax = matrix.length;
        int colMax = matrix[0].length;
        int left = rowMax - 1;
        int right = 0;
        while (left >= 0 || right < colMax) {
            if (matrix[left][right] ==target) {
                return true;
            }else if (matrix[left][right] > target){
                left--;
            }else {
                right++;
            }
        }
        return false;
    }
}
