package interview0617;

/**
 * @author aojie
 * @Function
 * @create 2024-07-12 14:25
 */
public class MaxProduct {
    public static void main(String[] args) {
        int[] req = {2,3,-2,4};
        System.out.println(new MaxProduct().maxProduct(req));
    }
    public int maxProduct(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] maxDp = new int[nums.length];
        int[] minDp = new int[nums.length];
        maxDp[0] = nums[0];
        minDp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxDp[i] = Math.max(nums[i] * maxDp[i -1], Math.max(nums[i] * minDp[i - 1], nums[i]));
            minDp[i] = Math.min(nums[i] * minDp[i -1], Math.min(nums[i] * maxDp[i - 1], nums[i]));
            max = Math.max(maxDp[i], max);
        }
        return max;
    }
}
