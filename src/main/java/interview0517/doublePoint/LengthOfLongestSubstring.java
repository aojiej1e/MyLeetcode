package interview0517.doublePoint;

import java.util.HashMap;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-05-30 16:21
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("abcabcbb"));
    }
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] charArray = s.toCharArray();
        int len = s.length();
        int max = Integer.MIN_VALUE;
        int left = -1;
        for (int i = 0; i < len; i++) {
            if (hashMap.containsKey(charArray[i])) {
                left = Math.max(left, hashMap.get(charArray[i]));
            }
            hashMap.put(charArray[i], i);
            max = Math.max(max, i - left);

        }
        return max;
    }
}
