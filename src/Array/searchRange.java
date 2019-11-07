package Array;

import java.util.ArrayList;
import java.util.List;

public class searchRange {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(searchRange(nums,8));
    }

    public static int[] searchRange(int[] nums, int target) {
        int left = 0,right = nums.length-1;
        int[] arr = new int[2];
        List<Integer> list = new ArrayList<>();
        while (left<=right){
            int mid = (left+right)/2;;
            if (nums[mid]<target){
                left = mid+1;
            }

        }
        if (list.size()==0){
            arr[0] = -1;
            arr[1] = -1;
        }else{
            arr[0] = list.get(0);
            arr[1] = list.get(list.size()-1);
        }
        return arr;
    }
}
