package Array;

import java.util.HashMap;
import java.util.Map;

public class subarraySum {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        int sum = subarraySum(nums, 9);
        System.out.println(sum);
    }
    public static int subarraySum(int[] nums, int k) {
        int count = 0,sum = 0;
        if (nums == null || nums.length == 0) return count;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)){
                count += map.get(sum- k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
