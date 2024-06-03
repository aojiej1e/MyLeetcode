package interview0517.doublePoint;

import java.util.Arrays;

/**
 * @author aojie
 * @Function
 * @create 2024-05-30 14:54
 */
public class TwoSum {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left != right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            }else if (numbers[left] + numbers[right] < target){
                left++;
            }else {
                return new int[]{left + 1, right + 1};
            }
        }
        return res;
    }
}
