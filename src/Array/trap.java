package Array;

/**
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，
 * 计算按此排列的柱子，下雨之后能接多少雨水。
 */
public class trap {
    public int trap(int[] height) {
        int left = 0,right = height.length -1;
        int ans = 0;
        int left_max = 0,right_max = 0;
        while (left<right){
            if (height[left]<height[right]){
                if (height[left] >= left_max) {
                    left_max = height[left];
                } else {
                    ans += left_max - height[left];
                }
                left++;
            }else{
                if (height[right]>=right_max){
                    right_max = height[right];
                }else {
                    ans += right_max - height[right];
                }
                right--;
            }
        }
        return ans;
    }
}
