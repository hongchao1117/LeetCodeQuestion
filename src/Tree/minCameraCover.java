package Tree;

/**
 * 给定一个二叉树，我们在树的节点上安装摄像头。
 * <p>
 * 节点上的每个摄影头都可以监视其父对象、自身及其直接子对象。
 * <p>
 * 计算监控树的所有节点所需的最小摄像头数量。
 */
public class minCameraCover {
    /**
     * 贪心算法
     * 从叶子结点看起，把摄像头放在叶子结点的父节点
     *
     * @param root
     * @return
     */
    //0 - 该结点没有被摄像头覆盖
    //1 - 该节点被摄像头覆盖
    //2 - 该节点安装了摄像头
    int res = 0;

    public int minCameraCover(TreeNode root) {
        if (dfs(root) == 0) {
            res++;
        }
        return res;
    }

    private int dfs(TreeNode root) {
        if (root == null) {
            return 1;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        if (left == 0 || right == 0) {
            res++;
            return 2;
        }
        if (left == 1 && right == 1) {
            return 0;
        }
        if (left == 2 || right == 2) {
            return 1;
        }
        return -1;

    }
}
