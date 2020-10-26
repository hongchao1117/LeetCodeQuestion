package Tree;

/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树。
 */
public class Codec {
    private TreeNode root;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        this.root = root;
        return null;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        return root;
    }
}
