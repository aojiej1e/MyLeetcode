package interview0517.binaryOperate;

/**
 * @author aojie
 * @Function
 * @create 2024-06-17 13:55
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
