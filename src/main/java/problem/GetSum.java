package problem;

/**
 * @author aojie
 * @Function
 * @create 2024-02-22 20:27
 */
public class GetSum {
    public static void main(String[] args) {
        System.out.println(new GetSum().getSum(2, 3));
    }
    public int getSum(int a, int b) {
        while (b != 0) {
            int c = (a & b) << 1;
            a ^= b;
            b = c;
        }
        return a;
    }
}
