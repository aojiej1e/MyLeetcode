package interview0617;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author aojie
 * @Function
 * @create 2024-07-04 16:46
 */
public class GenerateParenthesis {
    public static void main(String[] args) {

    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        dfs(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    private void dfs(ArrayList<String> result, StringBuilder sb, int start, int end, int n) {
        if (sb.length() == n * 2) {
            result.add(sb.toString());
            return;
        }
        if (start < n) {
            sb.append("(");
            dfs(result, sb, start + 1, end, n);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (start > end) {
            sb.append(")");
            dfs(result,sb, start, end + 1, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
