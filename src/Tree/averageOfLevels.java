package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class averageOfLevels {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Double> TheAverage(TreeNode root) {
//        List<Double> res = new ArrayList<>();
//        Queue<TreeNode> list = new LinkedList<>();
//        list.add(root);
//        while (!list.isEmpty()){
//            int len = list.size();
//            double sum = 0;
//            for (int i = 0; i < len; i++) {
//                TreeNode node = list.poll();
//                sum +=  node.val;
//                if (node.left!=null) list.add(node.left);
//                if (node.right!=null) list.add(node.right);
//            }
//            res.add(sum/len);
//        }
//        return res;
//    }

        List<Double> res = new ArrayList<>();
        Queue<TreeNode> list = new LinkedList<>();
        double sum = 0;
        int len = 0;
        list.add(root);
        while (list.size() != 0) {
            len = list.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = list.poll();
                sum += node.val;
                if (node.left != null) list.add(node.left);
                if (node.right != null) list.add(node.right);
            }
            res.add(sum / len);
        }
        return res;

    }
}
