package Tree;

/**
 * 验证二叉搜索的前序遍历
 */
public class VerifyBstPreorder {
    public boolean verifyPreorder(int[] preorder) {
        if (preorder == null || preorder.length == 0) {
            return true;
        }
        return verifyPreorderHelper(preorder, 0, preorder.length - 1);
    }

    public boolean verifyPreorderHelper(int[] preorder, int start, int end) {
        if (start >= end) {
            return true;
        }
        int root = preorder[start];
        int rightStart = start + 1;
        while (rightStart <= end && preorder[rightStart] < root) {
            rightStart++;
        }

        for (int i = rightStart; i <= end; i++) {
            if (preorder[i] < root) {
                return false;
            }
        }

        return verifyPreorderHelper(preorder, start + 1, rightStart - 1) && verifyPreorderHelper(preorder, rightStart, end);
    }
}
