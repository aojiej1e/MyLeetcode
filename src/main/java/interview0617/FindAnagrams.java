package interview0617;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-06-18 16:29
 */
public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> result = new ArrayList<>();
        char[] charArray = s.toCharArray();
        int sLen = s.length();
        int pLen = p.length();
        if (sLen < pLen) {
            return new ArrayList<>();
        }

        int[] sCount = new int[26];
        int[] pCount = new int[26];
        for (int i = 0; i < pLen; i++) {
            ++sCount[s.charAt(i) - 'a'];
            ++pCount[p.charAt(i) - 'a'];
        }
        if (Arrays.equals(sCount, pCount)) {
            result.add(0);
        }
        for (int i = 0; i < sLen - pLen; i++) {
            --sCount[charArray[i] - 'a'];
            ++sCount[charArray[i + pLen] - 'a'];
            if (Arrays.equals(sCount, pCount)) {
                result.add(i+ 1);
            }
        }
        return result;

    }
}
