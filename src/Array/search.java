package Array;

//搜索旋转排序数组
public class search {
    public int search(int[] nums, int target) {
        int left = 0;//最左边的数
        int right = nums.length-1;//最左边的数
        while (left<=right){
            int mid = (left+right)>>2;
            if (nums[mid]==target)
                return mid;
            if (nums[mid]<nums[right]){//右边可能未发生旋转
               if (nums[mid]<target && target<=nums[right])
                   left = mid+1;
               else
                   right = mid -1;
            }else{
                if (nums[left]<=target && target<nums[mid]){
                    right = mid - 1;
                }else{
                    left = mid +1;
                }
            }
        }
        return -1;


    }
}
