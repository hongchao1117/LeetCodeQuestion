package Tree;

public class rob_02 {
    public int rob(TreeNode root) {
        if (root==null) return 0;
        int[] res = getRes(root);
        return Math.max(res[0],res[1]);
    }

    private int[] getRes(TreeNode root) {
        if (root==null) return new int[2];
        int[] res = new int[2];

        int[] left = getRes(root.left);
        int[] right = getRes(root.right);
        res[0] = Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        res[1] = left[0]+right[0]+root.val;
        return res;

    }

}
