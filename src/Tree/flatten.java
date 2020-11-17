package Tree;

public class flatten {
    public void flatten(TreeNode root) {
        if (root==null) return;
        while(root!=null){
            if (root.left==null){
                root = root.right;
            }else{
                TreeNode pre = root.left;
                while(pre.right!=null){
                    pre = pre.right;
                }
                pre.right = root.right;
                root.right = root.left;
                root.left = null;
                root = root.right;

            }
        }

    }
}
