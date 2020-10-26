package Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 请实现一个函数按照之字形顺序打印二叉树，
 * 即第一行按照从左到右的顺序打印，
 * 第二层按照从右到左的顺序打印，
 * 第三行再按照从左到右的顺序打印，
 * 其他行以此类推。
 */
public class levelOrder {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        methodHelper(root, 0);
        return res;
    }

    private void methodHelper(TreeNode root, int k) {
        if (root == null) return;
        if (res.size() == k) res.add(new ArrayList<>());
        if (k%2==0){
            res.get(k).add(root.val);
        }else{
            res.get(k).add(0,root.val);
        }
        methodHelper(root.left,k+1);
        methodHelper(root.right,k+1);
    }
}
