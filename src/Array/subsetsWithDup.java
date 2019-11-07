package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsetsWithDup {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        getRes(nums,0,new ArrayList<>(),res);
        return res;

    }

    private void getRes(int[] nums, int start, ArrayList<Integer> list, List<List<Integer>> res) {
        res.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; i++) {
            //和上一个数字想等则跳过
            if (i>start && nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            getRes(nums,i+1,list,res);
            list.remove(list.size()-1);
        }
    }
}
