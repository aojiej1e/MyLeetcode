package problem;


import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-02-25 16:08
 */
public class FindAnagrams {
    public static void main(String[] args) {
        System.out.println(new FindAnagrams().findAnagramsPlus("baa", "aa"));
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        char[] sCharArray = s.toCharArray();
        char[] charArray = p.toCharArray();
        Arrays.sort(charArray);
        String sortP = new String(charArray);
        int pLen = p.length();
        for (int i = 0; i < sCharArray.length; i++) {
            if (p.indexOf(sCharArray[i]) != -1 && (i + pLen) <= s.length()) {
                char[] copyOfRange = Arrays.copyOfRange(sCharArray, i, i + pLen);
                Arrays.sort(copyOfRange);
                String subStr = new String(copyOfRange);
                if (sortP.equals(subStr)) {
                    res.add(i);
                }
            }
        }
        return res;
    }

    public List<Integer> findAnagramsPlus(String s, String p) {
        int[] sArr = new int[26];
        int[] pArr = new int[26];
        int sLen = s.length();
        int pLen = p.length();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < pLen; i++) {
            ++sArr[s.charAt(i) - 'a'];
            ++pArr[p.charAt(i) - 'a'];
        }
        if (Arrays.equals(sArr, pArr)) {
            res.add(0);
        }
        for (int i = 0; i < sLen - pLen; i++) {
            --sArr[s.charAt(i) - 'a'];
            ++sArr[s.charAt(i +  pLen) - 'a'];
            if (Arrays.equals(sArr, pArr)) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
