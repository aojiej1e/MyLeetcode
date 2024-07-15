package interview0617;

import java.util.*;

/**
 * @author aojie
 * @Function
 * @create 2024-06-17 14:24
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String newStr = new String(charArray);
            boolean containsKey = hashMap.containsKey(newStr);
            if (containsKey) {
                List<String> strings = hashMap.get(newStr);
                strings.add(str);
            }else {
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                hashMap.put(newStr, list);
            }
        }
        return new ArrayList<>(hashMap.values());
    }
}
