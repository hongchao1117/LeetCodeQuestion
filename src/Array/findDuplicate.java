package Array;

public class findDuplicate {
    public int findDuplicate(int[] nums) {
        int fast = 0,slow = 0;
        while(true){
            fast = nums[nums[fast]];
            slow = nums[slow];
            if (fast==slow){
                fast = 0;
                while (nums[slow]!=nums[fast]){
                    fast = nums[fast];
                    slow = nums[slow];
                }
                return nums[slow];
            }
        }
    }
}
