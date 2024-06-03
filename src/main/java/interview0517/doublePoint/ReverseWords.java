package interview0517.doublePoint;

/**
 * @author aojie
 * @Function
 * @create 2024-05-30 15:53
 */
public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(new ReverseWords().reverseWords("  hello world  "));
    }

    public String reverseWords(String s) {
        char[] charArray = s.toCharArray();
        int len = charArray.length;
        StringBuilder temp = new StringBuilder();
        StringBuilder newS = new StringBuilder();
        int index = len - 1;
        while (index >= 0) {
            if (s.charAt(index) != ' ') {
                temp.insert(0, s.charAt(index));
            }else {
                if (temp.length() != 0) {
                    newS.append(temp);
                    newS.append(s.charAt(index));
                    temp = new StringBuilder();
                }
            }
            index--;
        }
        if (temp.length() != 0) {
            newS.append(temp);
        }
        if (newS.charAt(newS.length() - 1) == ' ') {
            newS.deleteCharAt(newS.length() -1);
        }
        return newS.toString();
    }
}
