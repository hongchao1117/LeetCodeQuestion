package Tree;

public class buildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return getRes(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode getRes(int[] preorder, int preL, int preR, int[] inorder, int inL, int inR) {
        if (preL > preR || inL > inR) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preL]);
        for (int i = inL; i < inorder.length; i++) {
            if (preorder[preL] == inorder[i]) {
                root.left = getRes(preorder, preL + 1, preL + i - inL, inorder, inL, i - 1);
                root.right = getRes(preorder, preL + i - inL + 1, preR, inorder, i + 1, inR);
            }
        }
        return root;
    }

}
