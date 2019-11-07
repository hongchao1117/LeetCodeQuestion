package GreedyAlo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lastStoneWeightTest {
    public static void main(String[] args) {


        int[] stones = new int[]{54, 489, 4, 265, 1, 498, 451, 32, 123, 123, 41};

        int len = stones.length;
        if (len >= 2) {
            Arrays.sort(stones);
            stones[len - 2] = stones[len - 1] - stones[len - 2];
            int[] arr = new int[stones.length - 1];
            System.arraycopy(stones, 0, arr, 0, arr.length);
            if (arr.length == 1) {
                System.out.println(arr[0]);
            }
//            return lastStoneWeight(arr);
//        }else
//            return stones[0];

        }
    }
}
