package interview0517.hash;

import java.util.HashMap;

/**
 * @author aojie
 * @Function
 * @create 2024-05-29 16:09
 */
public class LongestPalindrome {
    public static void main(String[] args) {

    }

    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int length = s.length();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        boolean singleFlag = false;
        for (Integer value : hashMap.values()) {
            if (value % 2 == 1) {
                singleFlag = true;
                length--;
            }
        }
        return singleFlag ? length + 1 :length;

    }

}
