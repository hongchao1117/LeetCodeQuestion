package Mathmatics;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角问题
 */
public class generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int[][] arr = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j==0 || j==i){
                    arr[i][j] = 1;
                }else {
                    arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
                }
                list.add(arr[i][j]);
            }
            res.add(list);
        }
        return res;
    }
}
