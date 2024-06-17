package interview0517.dp;

import java.util.Arrays;

/**
 * @author aojie
 * @Function
 * @create 2024-06-07 15:02
 */
public class RunningSum {
    public static void main(String[] args) {

    }
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums;
        }
        int[] res = new int[len];
        res[0] = nums[0];
        res[1] = nums[0] + nums[1];
        for (int i = 2; i < len; i++) {
            res[i] = res[i - 1] + nums[i];
        }
        return res;
    }

}
