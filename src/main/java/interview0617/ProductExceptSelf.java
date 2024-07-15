package interview0617;

/**
 * @author aojie
 * @Function
 * @create 2024-06-20 17:45
 */
public class ProductExceptSelf {
    public static void main(String[] args) {

    }
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] resultArr = new int[nums.length];
        int preSum = 1;
        for (int i = 0; i < len; i++) {
            resultArr[i] = preSum;
            preSum *= nums[i];
        }
        int suffixSum = 1;
        for (int i = len - 1; i >= 0; i--) {
            resultArr[i] = resultArr[i] * suffixSum;
            suffixSum *= nums[i];
        }
        return resultArr;
    }
}
