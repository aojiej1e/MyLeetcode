package interview0617;

import com.google.common.collect.Lists;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author aojie
 * @Function
 * @create 2024-07-11 15:34
 */
public class WordBreak {
    public static void main(String[] args) {
        System.out.println(new WordBreak().wordBreak("leetcode", Lists.newArrayList("leet","code")));
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i + 1))) {
                    dp[i] = true;
                }
            }
        }
        return dp[s.length()];
    }



}
