package Tree;

public class sumNumbers {
    public static int sumNumbers(TreeNode root) {
        return sumNumbersHelper(0,root);
    }

    private static int sumNumbersHelper(int sum, TreeNode root) {
        if (root==null)
            return 0;
        sum = sum*10 + root.val;
        if (root.left==null && root.right==null)
            return sum;
        return sumNumbersHelper(sum,root.left)+sumNumbersHelper(sum,root.right);

    }

}
