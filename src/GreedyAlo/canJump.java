package GreedyAlo;

public class canJump {
    public boolean canJump(int[] nums) {
        int maxDis = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            if (i<=maxDis){
                maxDis = Math.max(maxDis,nums[i]+i);
            }
        }
        return maxDis >= nums.length -1;
    }
}
