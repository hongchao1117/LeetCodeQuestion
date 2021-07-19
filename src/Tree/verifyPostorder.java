package Tree;

public class verifyPostorder {
    public boolean verifyPostorder(int[] postorder) {
        return methodHelper(postorder, 0, postorder.length - 1);
    }

    private boolean methodHelper(int[] postorder, int l, int r) {
        if (l >= r) return true;
        int start = l;
        while (postorder[start] < postorder[r]) {
            start++;
        }
        int end = start;
        while (postorder[start] > postorder[r]) {
            start++;
        }
        return start == r && methodHelper(postorder, l, end - 1) && methodHelper(postorder, end, r - 1);
    }
}
