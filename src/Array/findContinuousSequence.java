package Array;

import java.util.ArrayList;
import java.util.List;

public class findContinuousSequence {
    public int[][] findContinuousSequence(int target) {
        int l = 1,r = 1,sum = 0,end = target/2;
        List<int[]> list = new ArrayList<>();
        while (l<=end){
            if (sum<target){
                sum += r;
                r++;
            }else if(sum>target){
                sum -= l;
                l++;
            }else{
                int[] nums = new int[r-l];
                for (int i = l; i < r; i++) {
                    nums[i-l] = i;
                }
                list.add(nums);
                sum -= l;
                l++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
