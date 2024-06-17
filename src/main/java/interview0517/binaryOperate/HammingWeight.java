package interview0517.binaryOperate;

/**
 * @author aojie
 * @Function
 * @create 2024-06-17 13:43
 */
public class HammingWeight {
    public static void main(String[] args) {

    }
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n>>=1;
        }
        return count;
    }
}
