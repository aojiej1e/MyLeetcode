package interview0617;

import java.util.HashMap;

/**
 * @author aojie
 * @Function
 * @create 2024-06-18 16:14
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring("dvdf"));
    }

    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        char[] charArray = s.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int maxLen = 0;
        int start = -1;
        for (int i = 0; i < len; i++) {
            if (hashMap.containsKey(charArray[i])) {
                start = Math.max(start, hashMap.get(charArray[i]));
            }
            hashMap.put(charArray[i], i);
            maxLen = Math.max(maxLen, i - start);
        }
        return maxLen;
    }
}
