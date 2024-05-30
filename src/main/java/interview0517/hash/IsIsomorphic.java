package interview0517.hash;

import java.util.HashMap;

/**
 * @author aojie
 * @Function
 * @create 2024-05-29 16:00
 */
public class IsIsomorphic {
    public static void main(String[] args) {

    }
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> hashMap = new HashMap<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                if (!hashMap.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            }else {
                if (hashMap.containsValue(t.charAt(i))) {
                    return false;
                }
                hashMap.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }

}
