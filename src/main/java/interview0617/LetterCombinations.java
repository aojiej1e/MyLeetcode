package interview0617;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2024-07-03 16:17
 */
public class LetterCombinations {
    public static void main(String[] args) {
        System.out.println(new LetterCombinations().letterCombinations("23"));
    }

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        HashMap<Integer, List<String>> hashMap = new HashMap<>();
        hashMap.put(2, Arrays.asList("a", "b", "c"));
        hashMap.put(3, Arrays.asList("d", "e", "f"));
        hashMap.put(4, Arrays.asList("g", "h", "i"));
        hashMap.put(5, Arrays.asList("j", "k", "l"));
        hashMap.put(6, Arrays.asList("m", "n", "o"));
        hashMap.put(7, Arrays.asList("p", "q", "r", "s"));
        hashMap.put(8, Arrays.asList("t", "u", "v"));
        hashMap.put(9, Arrays.asList("w", "x", "y", "z"));

        ArrayList<List<String>> request = new ArrayList<>();
        char[] charArray = digits.toCharArray();
        for (char c : charArray) {
            request.add(hashMap.get(c - '0'));
        }
        ArrayList<String> result = new ArrayList<>();
        dfs(request, result, new StringBuilder(), new boolean[request.size()], 0);
        return result;
    }

    private void dfs(ArrayList<List<String>> request, ArrayList<String> result, StringBuilder singleResult, boolean[] flags, int index) {
        if (singleResult.length() >= request.size()) {
            result.add(String.valueOf(singleResult));
            return;
        }
        if (index >= request.size()) {
            return;
        }
        List<String> stringList = request.get(index);
        for (int i = 0; i < stringList.size(); i++) {
            singleResult.append(stringList.get(i));
            dfs(request, result, singleResult, flags, index + 1);
            singleResult.deleteCharAt(index);
        }
    }
}
