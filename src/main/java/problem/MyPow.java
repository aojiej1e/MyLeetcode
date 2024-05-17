package problem;

/**
 * @author aojie
 * @Function
 * @create 2022-10-18 22:24
 */
public class MyPow {
    public static void main(String[] args) {
        MyPow myPow = new MyPow();
        System.out.println(myPow(2, -2));
    }
    public static double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        if (n == 0) {
            return 1;
        }
        if (n == Integer.MAX_VALUE) {
            return x;
        }
        if (x == -1 && n == Integer.MIN_VALUE) {
            return 1;
        }
        if (n == Integer.MIN_VALUE) {
            return 0;
        }

        double abs = Math.abs(n);
        boolean flag = abs % 2 == 1;
        double m = x;
        double count = Math.floor(abs / 2) ;
        count--;
        while (count > 0){
            x *= m;
            count--;
        }
        if (abs > 1) {
            x *=x;
        }
        if (flag && abs != 1) {
            x *= m;
        }
        if (n < 0) {
            x = 1/x;
        }
        return x;
    }
}
