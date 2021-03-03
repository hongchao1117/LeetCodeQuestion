package Array;

import java.util.PriorityQueue;
import java.util.Queue;

public class findKthLargest {
    public int findKthLargest(int[] nums, int k) {
//        Arrays.sort(nums);
//        int len = nums.length -k;
//        for (int i = 0; i <= len; i++) {
//            if (i==len)
//                return nums[len];
//        }
//        return -1;
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            if (i<k){
                queue.add(nums[i]);
            }else{
                if (queue.peek()<nums[i]){
                    queue.poll();
                    queue.add(nums[i]);
                }
            }
        }
        return queue.peek();
    }
}
