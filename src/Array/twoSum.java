package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {6,4,3,3,2};
        int target = 10;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
    public static int[] twoSum(int[] nums, int target) {
//        int[] arr = new int[2];
//        A:for (int i = 0; i < nums.length-1; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i]+nums[j]==target){
//                    arr[0] = i;
//                    arr[1] = j;
//                    break A;
//                }
//            }
//        }
//        return arr;
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                arr[0] = map.get(nums[i]);
                arr[1] = i;
                return arr;
            }
            map.put(target-nums[i],i);
        }
        return arr;
    }
}
