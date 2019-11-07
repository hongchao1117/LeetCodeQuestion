package Array;

import java.util.*;

public class sumEvenAfterQueries {
    public static void main(String[] args) {
        int[] A = new int[]{1,2,3,4};
        int[][] queries = new int[][]{{1,0},{-3,1},{-4,0},{2,3}};

        int[] NewArr = new int[queries.length];
        int sum=0;
        for (int num:A){
            if (num%2==0)
                sum += num;
        }
        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][1];
            int newNum = A[index] + queries[i][0];
            if(newNum%2==0) {
                if (A[index]%2==0)//偶数-->偶数  加上差值
                sum += queries[i][0];
                else //奇数 -->偶数  加上新的值
                sum += newNum;
            }else {
                if (A[index]%2==0)  //偶数 -->奇数，减掉A[index]
                    sum -= A[index];
            }
            NewArr[i] = sum;        //将偶数和依次放置新数组中
            A[index] = newNum;      //原数组中的元素变换之后的数

        }
        System.out.println(Arrays.toString(NewArr));
    }
}
