package Array;

public class canJump {
    public boolean canJump(int[] nums) {
        boolean flag = true;
        for (int i = nums.length-1; i >=0 ; i--) {
            if (nums[i]==0){
                int j = i-1;
                while (j>=0){
                    if(nums[j]>i-j)
                        break;
                    else{
                        j--;
                        if (j==0)
                            flag = false;
                    }
                }
            }
        }
        return flag;
    }
}
