package interview0517.find;

/**
 * @author aojie
 * @Function
 * @create 2024-06-03 16:30
 */
public class PivotIndex {
    public static void main(String[] args) {

    }
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            rightSum += nums[i];
        }
        for (int i = 0; i < len; i++) {
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];

        }
        return -1;

    }
}
