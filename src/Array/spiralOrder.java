package Array;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int left = 0, right = matrix[0].length - 1, start = 0, end = matrix.length - 1;
        while (true) {

            for (int i = left; i <= right; i++) {
                list.add(matrix[start][i]);
            }
            if (++start > end) {
                break;
            }
            for (int i = start; i <= end; i++) {
                list.add(matrix[i][right]);
            }
            if (--right < left) {
                break;
            }
            for (int i = right; i >= left; i--) {
                list.add(matrix[end][i]);
            }
            if (--end < start) {
                break;
            }
            for (int i = end; i >= start; i--) {
                list.add(matrix[i][left]);
            }
            if (++left > right) {
                break;
            }
        }
        return list;
    }

}
