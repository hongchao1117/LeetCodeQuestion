package Tree;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树。
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder res = getSerRes(root,new StringBuilder());
        return res.toString();
    }

    private StringBuilder getSerRes(TreeNode root, StringBuilder stringBuilder) {
        if (root==null){
            stringBuilder.append("null,");
            return stringBuilder;
        }
        stringBuilder.append(root.val);
        stringBuilder.append(",");
        getSerRes(root.left,stringBuilder);
        getSerRes(root.right,stringBuilder);
        return stringBuilder;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] strings = data.split(",");
        LinkedList<String> list = new LinkedList<>(Arrays.asList(strings));
        return getDeserRes(list);
    }

    private TreeNode getDeserRes( LinkedList<String> list) {
        if (list.get(0).equals("null")){
            list.remove(0);
            return null;
        }
        TreeNode res = new TreeNode(Integer.parseInt(list.get(0)));
        list.remove(0);
        res.left = getDeserRes(list);
        res.right = getDeserRes(list);
        return res;
    }
}
