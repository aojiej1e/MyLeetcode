package interview0517.hash;

import java.util.HashMap;

/**
 * @author aojie
 * @Function
 * @create 2024-05-29 15:20
 */
public class IsAnagram {
    public static void main(String[] args) {

    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] characterArr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            characterArr[s.charAt(i) - 'a']++;
            characterArr[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (characterArr[i] != 0) {
                return false;
            }
        }
        return true;

    }
}
