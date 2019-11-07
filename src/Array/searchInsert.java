package Array;

import java.util.Arrays;

public class searchInsert {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums,0));
    }

    public static int searchInsert(int[] nums, int target) {

        if (nums[nums.length-1]<target)
            return nums.length;
        int left = 0,right= nums.length-1;
        int num;
        while (left<=right){
            int mid = (left+right)/2;
            if(nums[mid]==target)
                return mid;
            if (nums[mid]<target){
                left = mid+1;
            }else
                right = mid-1;
        }
        return left;
        /**int res = Arrays.binarySearch(nums,target);
        return res>=0?res:-res-1;*/


    }
}
