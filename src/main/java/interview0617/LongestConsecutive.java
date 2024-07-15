package interview0617;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author aojie
 * @Function
 * @create 2024-06-17 14:42
 */
public class LongestConsecutive {
    public static void main(String[] args) {
        int[] req = new int[]{100,4,200,1,3,2};
        System.out.println(new LongestConsecutive().longestConsecutive(req));
    }
    public int longestConsecutive(int[] nums) {
        if (nums.length ==0) {
            return 0;
        }
        int max = 0;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int num : nums) {
            hashSet.add(num);
        }
        for (Integer integer : hashSet) {
            if (!hashSet.contains(integer - 1)) {
                int count = 1;
                int start = integer + 1;
                while (hashSet.contains(start)) {
                    count++;
                    start++;
                }
                max = Math.max(max, count);
            }
        }
        return max;

    }
}
