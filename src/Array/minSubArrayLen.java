package Array;

public class minSubArrayLen {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(minSubArrayLen(11,nums));
    }

    public static int minSubArrayLen(int s, int[] nums) {
       int sum = 0,x=0;
       int i = 0;
       int minCount = Integer.MAX_VALUE;
       int start = 0;
       while (i<nums.length){
           if (sum+nums[i]<s){
               sum += nums[i];
               i++;
           }else {
               minCount = Math.min(minCount,i-start+1);
               sum = sum -nums[start];
               start++;
           }
       }
       return minCount == Integer.MAX_VALUE?0:minCount;
    }
}
