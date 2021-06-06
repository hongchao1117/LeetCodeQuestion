package Array;

import java.util.PriorityQueue;
import java.util.Queue;

public class findKthLargest {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (i < k) {
                queue.add(nums[i]);
            } else {
                if (queue.peek() < nums[i]) {
                    queue.poll();
                    queue.add(nums[i]);
                }

            }
        }
        return queue.peek();
    }
}
