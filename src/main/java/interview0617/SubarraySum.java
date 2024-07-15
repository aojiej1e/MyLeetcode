package interview0617;

import java.util.HashMap;

/**
 * @author aojie
 * @Function
 * @create 2024-06-19 16:50
 */
public class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        //结果
        int count = 0;
        //hashmap 存储前缀和以及出现次数
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1);
        //前缀和
        int preSum = 0;
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            if (hashMap.containsKey(preSum - k)) {
                count ++;
            }
            hashMap.put(preSum, hashMap.getOrDefault(preSum, 1) + 1);
        }
        return count;
    }
}
