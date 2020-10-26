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
       int l = 0,r = nums.length-1;
       int[] arr = new int[2];
       while (l<r){
           if (nums[l]+nums[r]<target)
               l++;
           else if (nums[l]+nums[r]>target)
               r--;
           else{
               arr[0] = nums[l];
               arr[1] = nums[r];
               return arr;
           }
       }
       return arr;
    }
}
