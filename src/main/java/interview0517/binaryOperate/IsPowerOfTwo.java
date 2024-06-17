package interview0517.binaryOperate;

/**
 * @author aojie
 * @Function
 * @create 2024-06-17 13:47
 */
public class IsPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        return (n & (n - 1)) == 1;
    }
}
