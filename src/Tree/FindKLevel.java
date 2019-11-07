package Tree;

import java.util.logging.Level;

public class FindKLevel {
    int leafNum = 0;
    public int FindKLevel(TreeNode root,int k){
        if (root==null || k<=0) return 0;
        if (k==0){
            if (root.left==null && root.right==null){
                return 1;
            }
        }
       int left = FindKLevel(root.left,k-1);
       int right = FindKLevel(root.right,k-1);
       return left+right;
    }


}
