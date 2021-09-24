package Tree;

public class buildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        TreeNode root = rec(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
//        return root;
//    }
//
//    private TreeNode rec(int[] preorder, int startPre, int endPre, int[] inorder, int startIn, int endIn) {
//        if (startIn>endIn || startPre>endPre) return null;
//        TreeNode root = new TreeNode(preorder[startPre]);
//        for (int i = startIn; i <= endIn; i++) {
//            if (preorder[startPre]==inorder[i]){
//                root.left = rec(preorder,startPre+1,startPre+i-startIn,inorder,startIn,endIn-1);
//                root.right = rec(preorder,i-startIn+startPre+1,endPre,inorder,i+1,endIn);
//            }
//        }
//        return root;
        TreeNode root = getRes(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        return root;
    }

    private TreeNode getRes(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        for (int i = inStart; i <= inEnd; i++) {
            if (preorder[preStart] == inorder[i]) {
                root.left = getRes(preorder, preStart + 1, i - inStart + preStart, inorder, inStart, i - 1);
                root.right = getRes(preorder, i - inStart + preStart + 1, preEnd, inorder, i + 1, inEnd);
            }
        }
        return root;
    }

}
