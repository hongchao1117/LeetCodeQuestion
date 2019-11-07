package Tree;

import Tree.test.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 每层结点的最大值
 */
public class largestValues {
    public List<Integer> largestValues(TreeNode root) {
        /**List<Integer> list = new ArrayList<>();
        if (root==null)
            return list;
        Queue<TreeNode> queue = new LinkedList<>();
        int len;//queue的长度
        queue.add(root);
        while (!queue.isEmpty()){
            len = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.peek();
                queue.poll();
                if (node.val>max)   max = node.val;
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right!=null){
                    queue.add(node.right);
                }
            }
            list.add(max);
        }
        return list;**/
        List<Integer> list = new ArrayList<>();
        if (root==null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int max = Integer.MIN_VALUE;
        while (!queue.isEmpty()){
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode temp = queue.poll();
                if (temp.val>max){
                    max = temp.val;
                }
                if (temp.left!=null)
                    queue.add(temp.left);
                if (temp.right!=null)
                    queue.add(temp.right);
            }
            list.add(max);
        }
        return list;
    }
}
