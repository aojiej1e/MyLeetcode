package interview0517.doublePoint;

/**
 * @author aojie
 * @Function
 * @create 2024-05-30 11:35
 */
public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(new IsSubsequence().isSubsequence("bb", "ahbgdc"));
    }

    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        if (s.length() > t.length()) {
            return false;
        }
        int sIndex = 0;
        int tIndex = 0;
        int sLen = s.length();
        int tLen = t.length();
        while (sIndex < sLen && tIndex < tLen) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }
        return sIndex == sLen;
    }
}
