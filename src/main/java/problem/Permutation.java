package problem;

import java.util.*;

/**
 * @author aojie
 * @Function
 * @create 2022-11-15 21:13
 */
public class Permutation {
    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        System.out.println(Arrays.toString(permutation.permutation("dkjphedy")));
    }

    public String[] permutation(String s) {
        if (s == null || s.length() == 1) {
            return new String[]{s};
        }
        List<String> resList = new ArrayList<>();
        List<String> singStrList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            singStrList.add(s.substring(i, i+1));
        }
        recursive(resList, "", singStrList);
        String[] strings = new String[resList.size()];
        int index = 0;
        for (String value : resList) {
            strings[index++] = value;
        }
        return strings;
    }

    private void recursive(List<String> resList, String str, List<String> singStrList) {
        if (singStrList.isEmpty() && !resList.contains(str)) {
            resList.add(str);
            return;
        }

        for (String nextStr : singStrList) {
            List<String> arrayList = new ArrayList<>(singStrList);
            arrayList.remove(nextStr);
            recursive(resList, str + nextStr, arrayList);
        }
    }
}
