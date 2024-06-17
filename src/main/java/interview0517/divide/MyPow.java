package interview0517.divide;

/**
 * @author aojie
 * @Function
 * @create 2024-06-06 16:39
 */
public class MyPow {
    public static void main(String[] args) {
        System.out.println(new MyPow().myPow(10,-2));
    }
    public double myPow(double x, int n) {
        if (x == 1 || n == 0) {
            return 1;
        }
        double interval = x;
        double res = 1;
        long newN = n;
        if (newN < 0) {
            newN = -newN;
            interval = 1 / x;
        }
        while (newN > 0) {
            if (((newN & 1) == 1)) {
                res *= interval;
            }
            interval *= interval;
            newN >>= 1;
        }
        return res;
    }
}
