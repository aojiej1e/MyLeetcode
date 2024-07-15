package interview0617;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-07-04 17:42
 */
public class Partition {
    ArrayList<List<String>> result = new ArrayList<>();
    List<String> path = new ArrayList<>();
    String str;

    public List<List<String>> partition(String s) {
        this.str = s;
        dfs(0);
        return result;
    }

    private void dfs(int start) {
        if (start == str.length()) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < str.length(); i++) {
            if (isPalindrome(start, i)) {
                path.add(str.substring(start, i + 1));
                dfs(i + 1);
                path.remove(path.size() - 1);
            }
        }
    }
    private boolean isPalindrome(int left, int right) {
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

}
