package GreedyAlo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class largestSumAfterKNegationsTest {
    public static void main(String[] args) {
        int[] A = new int[]{2,-3,-1,5,-4};
        int k = 2;

        //PriorityQueue通过二叉小顶堆实现，可以用一棵完全二叉树表示
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < A.length; i++) {
            priorityQueue.add(A[i]);//内部可自动排序
        }
        while (k > 0){
            priorityQueue.add(-priorityQueue.poll());
            k--;
        }
        int sum = 0;
        for (int num:priorityQueue) {
            sum += num;
        }
        System.out.println(sum);


    }
}
