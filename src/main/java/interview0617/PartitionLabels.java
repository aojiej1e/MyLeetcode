package interview0617;

import java.util.*;

/**
 * @author aojie
 * @Function
 * @create 2024-07-10 14:12
 */
public class PartitionLabels {
    public static void main(String[] args) {
        System.out.println(new PartitionLabels().partitionLabels("ababcbacadefegdehijhklij"));
    }
    public List<Integer> partitionLabels(String s) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            hashMap.put(charArray[i], i);
        }
        int left = 0;
        while (left < s.length()) {
            Integer len = hashMap.get(charArray[left]);
            for (int j = left; j < len; j++) {
                if (hashMap.get(charArray[j]) > len) {
                    len = hashMap.get(charArray[j]);

                }
            }

            result.add(len - left +  1);
            left = len + 1;
        }
        return result;
    }
}
