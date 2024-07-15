package interview0617;

/**
 * @author aojie
 * @Function
 * @create 2024-07-12 15:54
 */
public class CanPartition {
    public boolean canPartition(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int leftSum = nums[i];
            int rightSum = 0;
            for (int right = 0; right < nums.length; right++) {
                if (right == i) {
                    continue;
                }
                if (leftSum > rightSum) {
                    rightSum += nums[right];
                }else {
                    leftSum += nums[right];
                }
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;

    }
}
