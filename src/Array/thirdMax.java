package Array;

import java.util.*;

public class thirdMax {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 3, 2,2,2,2};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for (int num:nums){
            if (num>first){
                third = second;
                second = first;
                first = num;
            }else if (num>second && num <first){
                third = second;
                second = num;
            }else if (num>third && num<second){
                third = num;
            }
        }

    }
}
