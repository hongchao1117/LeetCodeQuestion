package Tree;

import java.util.HashMap;

public class buildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = rec(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
        return root;
    }

    private TreeNode rec(int[] preorder, int startPre, int endPre, int[] inorder, int startIn, int endIn) {
        if (startIn>endIn || startPre>endPre) return null;
        TreeNode root = new TreeNode(preorder[startPre]);
        for (int i = startIn; i <= endIn; i++) {
            if (preorder[startPre]==inorder[i]){
                root.left = rec(preorder,startPre+1,startPre+i-startIn,inorder,startIn,endIn-1);
                root.right = rec(preorder,i-startIn+startPre+1,endPre,inorder,i+1,endIn);
            }
        }
        return root;

    }

}
