package Array;

public class findMin {
    public int findMin(int[] nums) {
        int l = 0,r = nums.length-1;
        while (l<r){
            int mid = (l+r)/2;
            if (nums[mid]<nums[r])
                r = mid;
            else
                l = mid+1;
        }
        return nums[l];
    }
}
