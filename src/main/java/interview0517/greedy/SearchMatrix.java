package interview0517.greedy;

/**
 * @author aojie
 * @Function
 * @create 2024-06-14 18:03
 */
public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowMax = matrix.length - 1;
        int colMax = matrix[0].length;
        int start = 0;
        while (start < colMax && rowMax >= 0) {
            if (matrix[rowMax][start] > target) {
                rowMax--;
            }else if (matrix[rowMax][start] < target){
                start++;
            }else {
                return true;
            }
        }
        return false;
    }
}
