package Array;

import java.util.Arrays;

public class isStraight {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);//重新排序
        int zreoCount = 0, diff = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 0) {
                zreoCount++;
            } else {
                if (nums[i] == nums[i + 1]) return false;
                if (nums[i] + 1 != nums[i + 1]) diff += nums[i+1]-nums[i]-1;
            }
        }
        return zreoCount >= diff ;
    }
}
