package Array;

public class partitionDisjoint {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 0, 3, 8, 6};
        int disjoint = partitionDisjoint(nums);
        System.out.println(disjoint);
    }

    public static int partitionDisjoint(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int leftMax = nums[0];
        int max = nums[0];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            if (nums[i] < leftMax) {
                leftMax = max;
                index = i;
            }
        }
        return index + 1;
    }
}
