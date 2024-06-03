package interview0517.simulate;

/**
 * @author aojie
 * @Function
 * @create 2024-05-31 14:01
 */
public class AddStrings {
    public static void main(String[] args) {

    }
    public String addStrings(String num1, String num2) {
        int num1Point = num1.length() - 1;
        int num2Point = num2.length() - 1;
        int add = 0;
        StringBuilder sb = new StringBuilder();
        while (num1Point >= 0 || num2Point >= 0) {
            int one = num1Point >= 0 ? num1.charAt(num1Point) - '0' : 0;
            int two = num2Point >= 0 ? num2.charAt(num2Point) - '0' : 0;
            int singleResult = one + two + add;
            add = singleResult / 10;
            sb.insert(0, singleResult % 10);
            num1Point--;
            num2Point--;
        }
        if (add != 0) {
            sb.insert(0, 1);
        }
        return sb.toString();


    }
}
