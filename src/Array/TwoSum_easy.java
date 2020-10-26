package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_easy {
    public int[] twoSum(int[] nums,int target){
        int[] arr = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                arr[0] = map.get(nums[i]);
                arr[1] = i;
            }
            map.put(target-nums[i],i);
        }
        return arr;
    }
}
