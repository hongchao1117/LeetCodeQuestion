package Tree;

public class rob_02 {
    public int rob(TreeNode root) {
        if (root==null) return 0;
        int[] res = getRes(root);
        return Math.max(res[0],res[1]);
    }

    private int[] getRes(TreeNode root) {
        if (root == null) return new int[2];
        //0:不偷  1：偷
        int[] res = new int[2];

        int[] left = getRes(root.left);
        int[] right = getRes(root.right);
        res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        res[1] = left[0] + right[0] + root.val;
        return res;
    }

//    public int rob(TreeNode root) {   //暴力解法，会超时
//        if (root == null) return 0;
//        int money = root.val;
//        if (root.left != null) {
//            money += (rob(root.left.left) + rob(root.left.right));
//        }
//        if (root.right != null) {
//            money += (rob(root.right.left) + rob(root.right.right));
//        }
//        return Math.max(money,rob(root.left)+rob(root.right));
//    }

}
