package Array;

import java.util.PriorityQueue;
import java.util.Queue;

public class findKthLargest {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        System.out.println(findKthLargest_quick(nums, 4));
        for (int num : nums) {
            System.out.print(num + ",");
        }
    }

    public static int findKthLargest(int[] nums, int k) {
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

    public static int findKthLargest_quick(int[] nums, int k) {
        k = nums.length - k;
        quickSort(nums, k, 0, nums.length - 1);
        return nums[k];
    }

    private static void quickSort(int[] nums, int k, int left, int right) {
        if (left >= right) return;
        int l = left, r = right;
        int base = nums[left];
        while (l < r) {
            while (l < r && base <= nums[r]) {
                r--;
            }
            while (l < r && base >= nums[l]) {
                l++;
            }
            if (l < r) {
                swap(nums, l, r);
            }
        }
        swap(nums, left, l);
        if (l == k) {
            return;
        } else if (l < k) {
            quickSort(nums, k, l + 1, right);
        } else {
            quickSort(nums, k, left, l - 1);
        }
    }

    public int findKthLargest_heap(int[] nums, int k) {
        int heapSize = nums.length;
        buildMaxHeap(nums, heapSize);
        for (int i = nums.length - 1; i >= nums.length - k + 1; --i) {
            swap(nums, 0, i);
            --heapSize;
            maxHeapify(nums, 0, heapSize);
        }
        return nums[0];
    }

    public void buildMaxHeap(int[] a, int heapSize) {
        for (int i = heapSize / 2; i >= 0; --i) {
            maxHeapify(a, i, heapSize);
        }
    }

    public void maxHeapify(int[] a, int i, int heapSize) {
        int l = i * 2 + 1, r = i * 2 + 2, largest = i;
        if (l < heapSize && a[l] > a[largest]) {
            largest = l;
        }
        if (r < heapSize && a[r] > a[largest]) {
            largest = r;
        }
        if (largest != i) {
            swap(a, i, largest);
            maxHeapify(a, largest, heapSize);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}




