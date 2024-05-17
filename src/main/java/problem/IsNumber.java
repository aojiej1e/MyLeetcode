package problem;

/**
 * @author aojie
 * @Function 就是tm最恶心的题目
 * @create 2022-10-20 21:49
 */
public class IsNumber {
    public static void main(String[] args) {
        IsNumber isNumber = new IsNumber();
        System.out.println(isNumber.isNumber(".E2"));
    }

    public boolean isNumber(String s) {
        if (s == null) {
            return false;
        }
        String pureString = s.trim();
        if (pureString.length() == 0) {
            return false;
        }
        char[] charArray = pureString.toCharArray();
        boolean startFlag = charArray[0] != '-' && charArray[0] != '+' && (charArray[0] < '0' || charArray[0] > '9') && charArray[0] != '.';
        if (startFlag) {
            return false;
        }
        int pointCount = 0;
        int eCount = 0;
        for (int i = 0; i < charArray.length; i++) {
            boolean flag = charArray[i] != '-' && charArray[i] != '+' && (charArray[i] < '0' || charArray[i] > '9') && charArray[i] != '.' && charArray[i] != 'e' && charArray[i] != 'E';
            if (flag) {
                return false;
            }
            if (charArray[i] == '-' || charArray[i] == '+') {
                if (charArray.length == 1) {
                    return false;
                }
                if (i == charArray.length - 1) {
                    return false;
                }
                if (i + 1 < charArray.length) {
                    if ((charArray[i + 1] < '0' || charArray[i + 1] > '9') && charArray[i + 1] != '.') {
                        return false;
                    }
                }
            }
            if (charArray[i] == '.') {
                if (pointCount > 0 || eCount > 0) {
                    return false;
                }
                pointCount++;

                if (charArray.length == 1) {
                    return false;
                }
                if (i == 0 && (charArray[i + 1] < '0' || charArray[i + 1] > '9')) {
                    return false;
                }
                if (i == charArray.length - 1) {
                    if (charArray[i - 1] < '0' || charArray[i - 1] > '9') {
                        return false;
                    }
                }
                if (i + 1 < charArray.length) {
                    if ((charArray[i + 1] < '0' || charArray[i + 1] > '9') && charArray[i + 1] != 'e' && charArray[i + 1] != 'E') {
                        return false;
                    }
                }
            }
            if (charArray[i] == 'e' || charArray[i] == 'E') {
                if (eCount > 0) {
                    return false;
                }
                eCount++;
                if (i == charArray.length - 1) {
                    return false;
                }
                if (i + 1 < charArray.length) {
                    if ((charArray[i + 1] < '0' || charArray[i + 1] > '9') && charArray[i + 1] != '-' && charArray[i + 1] != '+') {
                        return false;
                    }
                }
            }
            if (charArray[i] >= '0' && charArray[i] <= '9') {
                if (i + 1 < charArray.length) {
                    if (charArray[i + 1] == '-' || charArray[i + 1] == '+') {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
