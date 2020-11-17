package Array;

import java.util.Arrays;

public class longestConsecutive {
    public static void main(String[] args) {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int consecutive = longestConsecutive(nums);
        System.out.println(consecutive);
    }

    public static int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int maxLen = 1,ans =1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==nums[i]-1) continue;
            if (nums[i] == nums[i-1]+1){
                maxLen++;
                ans = Math.max(ans,maxLen);
            }else{
                maxLen = 1;
            }
        }
        return ans;
    }
}
