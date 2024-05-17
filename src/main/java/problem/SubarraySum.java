package problem;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;

/**
 * @author aojie
 * @Function
 * @create 2024-02-27 21:17
 */
public class SubarraySum {
    public static void main(String[] args) {
        int[] req= {1,-1,0};
        System.out.println(new SubarraySum().subarraySum(req, 0));
    }
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int res = 0;
        int preSum = 0;
        hashMap.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            if (hashMap.containsKey(preSum - k)) {
                res++;
            }
            hashMap.put(preSum, hashMap.getOrDefault(preSum, 0) + 1);
        }
        return res;
    }
}
