package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class permute {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(permute(arr).toString());
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res =  new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        permuteHelper(res,list,nums,0);
        return res;
    }

    private static void permuteHelper(List<List<Integer>> res, List<Integer> list, int[] nums, int index) {
        if (index==nums.length){
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            res.add(arrayList);
            return;//返回上一层递归 or 直接返回
        }else {
            for (int i = 0; i < nums.length; i++) {
                if (!list.contains(nums[i])){
                    list.add(nums[i]);
                    permuteHelper(res,list,nums,index+1);
                    list.remove(list.size()-1);//回退，进行回溯
                }
            }
        }
    }
}
