package problem;

import java.util.HashMap;

/**
 * @author aojie
 * @Function
 * @create 2024-01-17 19:44
 */
public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(new IsAnagram().isAnagram("anagram", "nagaram"));
    }

    public boolean isAnagram(String s, String t) {
        char[] charArray = s.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : charArray) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            Integer integer = hashMap.get(c);
            if (integer == null) {
                return Boolean.FALSE;
            } else {
                hashMap.put(c, hashMap.get(c) - 1);
            }
        }
        for (Integer count: hashMap.values()) {
            if (!count.equals(0)) {
                return Boolean.FALSE;
            }
        }
        return true;

    }
}
