package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static void main(String[] args) {
        String a = "123";
        String b = a;
        b = b+987;
        System.out.println(a+" "+b);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            if (i==0 || (i>0 && nums[i]!=nums[i-1])){
                int l = i+1,r = nums.length-1,sum = 0-nums[i];
                while (l<r){
                    if (sum==nums[l]+nums[r]){
                        res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                        while (l<r && nums[l]==nums[l+1])   l++;
                        while (l<r && nums[r]==nums[r-1])   r--;
                        l++;
                        r--;
                    }else if (nums[r]+nums[l]<sum){
                        while (l<r && nums[l]==nums[l+1])   l++;//跳过重复值
                        l++;
                    }else{
                        while (l<r && nums[r]==nums[r-1]) r--;
                        r--;
                    }
                }
            }
        }
        return res;
    }

}
