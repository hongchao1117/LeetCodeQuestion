package Test;

import Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * [3,2,1] -> [1,2,3] -> [1,3,2]
 */
public class ZhihuDemo {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextNums(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    private static void nextNums(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);

    }

    private static void reverse(int[] nums, int i) {
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    //dfs 中序遍历 ltr
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode temp = stack.pop();
            res.add(temp.val);
            root = temp.right;
        }
        return res;
    }

    //bfs 层序遍历
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> levelTraversal(TreeNode root) {
        if (root == null) return res;
        getRes(root, 0);
        return res;
    }

    private void getRes(TreeNode root, int index) {
        if (root == null) return;
        if (index == res.size()) {
            res.add(new ArrayList<>());
        }
        res.get(index).add(root.val);
        getRes(root.left, index + 1);
        getRes(root.right, index + 1);
    }
}
