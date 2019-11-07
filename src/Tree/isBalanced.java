package Tree;

import Tree.test.Node;

public class isBalanced {
    public boolean isBalance(Node root) {
        return depth(root) == -1;
    }

    private int depth(Node root) {
        if (root == null)
            return 0;
//        int left = depth(root.left)+1;
//        int right = depth(root.right)+1;
//        return  Math.abs(left-right)>1?0:-1;
        return 0;
    }


}
