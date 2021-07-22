package Array;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class maxSlidingWindow {
    public static void main(String[] args) {
        int[] num = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(maxSlidingWindow(num, 3)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        /**int len = nums.length;
         if (len*k==0)
         return new int[0];
         int[] arr = new int[len-k+1];
         for (int i = 0; i < len-k+1; i++) {
         int max = Integer.MIN_VALUE;
         for (int j = i; j < k+i; j++) {
         max = Integer.max(nums[j],max);
         arr[i] = max;
         }
         }
         return arr;*/
        /**if (nums==null || nums.length<2)
         return nums;
         //双向队列 保存当前窗口最大值的数组未知，保证队列中数组位置的数按从大到小排序
         LinkedList<Integer> list = new LinkedList<>();
         //结果数组
         int[] res = new int[nums.length-k+1];
         for (int i = 0; i < nums.length; i++) {
         //保证从大到小 如果前面数小 弹出
         while (!list.isEmpty() && nums[list.peekLast()]<=nums[i]){
         list.pollLast();
         }
         //添加当前值对应的数组下标
         list.add(i);
         //初始化窗口 等到窗口长度为k时 下次移动在删除过期数值
         if (list.peek()<=i-k){
         list.poll();
         }
         //窗口长度为k时 在保存当前窗口中最大值
         if (i-k+1>=0){
         res[i-k+1] = nums[list.peek()];
         }
         }
         return res;

         }*/
        int len = nums.length;
        if (k == 0 || len == 0) {
            return new int[0];
        }
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[len - k + 1];
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() || deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.add(nums[i]);
        }
        res[0] = deque.peekFirst();
        for (int i = k; i < len; i++) {
            if (nums[i - k] == deque.peekFirst()) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() || deque.peekLast() < nums[i]) {
                deque.removeLast();
            }
            deque.add(nums[i]);
            res[i - k + 1] = deque.peekFirst();
        }
        return res;

    }
}
