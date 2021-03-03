package Tree;

public class pathSum_int {
    int pathNum = 0;

    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        sum(root, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return pathNum;
    }

    private void sum(TreeNode root, int sum) {
        if (root == null) return;
        sum -= root.val;
        if (sum == 0) pathNum++;
        sum(root.left, sum);
        sum(root.right, sum);
    }

}
