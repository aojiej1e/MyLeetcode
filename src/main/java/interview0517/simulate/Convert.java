package interview0517.simulate;

/**
 * @author aojie
 * @Function
 * @create 2024-05-31 15:28
 */
public class Convert {
    public static void main(String[] args) {

    }

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] sbArr = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sbArr[i] = new StringBuilder();
        }
        int index = 0;
        char[] charArray = s.toCharArray();
        boolean flag = true;
        for (char singleChar : charArray) {
            sbArr[index].append(singleChar);
            if (index == numRows - 1) {
                flag = false;
            }
            if (index == 0) {
                flag = true;
            }
            index = flag ? index + 1 : index - 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            sb.append(sbArr[i]);
        }
        return sb.toString();

    }
}
