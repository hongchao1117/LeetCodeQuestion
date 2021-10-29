package Array;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class findKthLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = 0, k = 0;
        if (in.hasNextInt()) {
            len = in.nextInt();
        }
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = in.nextInt();
        }
        if (in.hasNextInt()) {
            k = in.nextInt();
        }
        System.out.println(findKthLargest(nums, k));
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

    public int findKthLargest_quick(int[] nums, int k) {
        k = nums.length - k;
        quickSort(nums, 0, nums.length - 1, k);
        return nums[k];
    }

    private void quickSort(int[] nums, int left, int right, int k) {
        if (left >= right) return;
        int l = left;
        int r = right;
        int base = nums[left];
        while (l < r) {
            while (l < r && nums[r] >= base) r--;
            while (l < r && nums[l] <= base) l++;
            if (l < r) {
                swap(nums, l, r);
            }
        }
        swap(nums, left, l);
        if (l == k) {
            return;
        } else if (l > k) {
            quickSort(nums, left, l - 1, k);
        } else {
            quickSort(nums, l + 1, right, k);
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

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}




