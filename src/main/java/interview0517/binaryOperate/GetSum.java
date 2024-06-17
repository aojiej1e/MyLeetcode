package interview0517.binaryOperate;

/**
 * @author aojie
 * @Function
 * @create 2024-06-17 13:51
 */
public class GetSum {
    public int getSum(int a, int b) {
        while (b != 0) {
            //进位
            int c = (a & b) << 1;
            a ^= b;
            b = c;
        }
        return a;
    }
}
