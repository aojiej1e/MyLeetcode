package problem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author aojie
 * @Function
 * @create 2024-01-17 20:41
 */
public class FirstUniqChar {
    public static void main(String[] args) {
        System.out.println(new FirstUniqChar().firstUniqChar("aadadaad"));
    }
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            hashMap.put(charArray[i], hashMap.getOrDefault(charArray[i], 0) + 1);
        }
        for (Map.Entry<Character, Integer> value : hashMap.entrySet()) {
            if (value.getValue().equals(1)) {
                return s.indexOf(value.getKey());
            }
        }
        return  -1;


    }
}
