package interview0617;

/**
 * @author aojie
 * @Function
 * @create 2024-07-05 14:21
 */
public class FindMin {
    public int findMin(int[] nums) {
        int len = nums.length - 1;
        int left = 0;
        if (nums[left] < nums[len]) {
            return left;
        }
        while (len > 0) {
            if (nums[len - 1] > nums[len]) {
                return len;
            }
            len--;
        }
        return -1;
    }
}
