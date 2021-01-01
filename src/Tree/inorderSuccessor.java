package Tree;

import javafx.scene.transform.Rotate;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inorderSuccessor {
    int index = -1;
    List<TreeNode> res = new ArrayList<>();
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
//        if (root == null) return null;
//        if (root.val<=p.val){
//           return inorderSuccessor(root.right,p);
//        }
//        TreeNode treeNode = inorderSuccessor(root.left, p);
//        return treeNode == null?root:treeNode;
        methodHelper(root,p);
        return index+1>=res.size()?null:res.get(index+1);
    }

    private void methodHelper(TreeNode root, TreeNode p) {
        if (root==null) return;
        methodHelper(root.left,p);
        res.add(root);
        if (index!=-1){
            return;
        }
        if (root.val==p.val){
            index = res.size()-1;
        }
        methodHelper(root.right,p);
    }
}
