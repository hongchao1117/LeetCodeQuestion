package Array;

public class sortColors {
    public void sortColors(int[] nums) {
        int l = 0, r = nums.length - 1, index = 0;
        while (index<=r){
            if (nums[index]==0){
                swap(nums,l,index);
                index++;
                l++;
            }else if (nums[index]==1){
                index++;
            } else if (nums[index] == 2) {
               swap(nums,index,r);
               r--;
            }
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] =nums[b];
        nums[b] = temp;
    }


}
