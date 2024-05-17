package problem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aojie
 * @Function
 * @create 2022-11-09 22:08
 */
public class VerifyPostorder {
    public static void main(String[] args) {
        int[] req = new int[]{1,3,2,6,5};
        System.out.println(new VerifyPostorder().verifyPostorder(req));
    }
    public boolean verifyPostorder(int[] postorder) {
        if (postorder == null) {
            return true;
        }
        int length = postorder.length;
        if (length == 1) {
            return true;
        }
        return recursive(postorder, 0, length - 1);

    }

    private boolean recursive(int[] postorder, int i, int len) {
        if (i >= len) {
            return true;
        }
        int p = i;
        while (postorder[p] < postorder[len]) {
            p++;
        }
        int j = p;
        while (postorder[p] > postorder[len]) {
            p++;
        }
        return p == len && recursive(postorder, i, j - 1) && recursive(postorder, j, len - 1);
    }
}
