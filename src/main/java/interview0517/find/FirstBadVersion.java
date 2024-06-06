package interview0517.find;

/**
 * @author aojie
 * @Function
 * @create 2024-06-03 16:10
 */
public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(new FirstBadVersion().firstBadVersion(5));
    }
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (!isBadVersion(mid)) {
                start = mid + 1;
                continue;
            }
            if ((n == 1 && isBadVersion(n)) || !isBadVersion(n - 1)){
                return n;
            }
            end = mid - 1;
        }
        return -1;

    }

    private boolean isBadVersion(int version){
        if (version >= 4) {
            return true;
        }
        return Boolean.FALSE;
    }
}
