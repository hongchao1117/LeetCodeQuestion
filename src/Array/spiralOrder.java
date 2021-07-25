package Array;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0) return res;
        int l = 0, r = matrix[0].length - 1, s = 0, e = matrix.length - 1;
        while (true) {
            for (int i = l; i <= r; i++) res.add(matrix[s][i]); // left to right.
            if (++s > e) break;
            for (int i = s; i <= e; i++) res.add(matrix[i][r]); // top to bottom.
            if (l > --r) break;
            for (int i = r; i >= l; i--) res.add(matrix[e][i]); // right to left.
            if (s > --e) break;
            for (int i = e; i >= s; i--) res.add(matrix[i][l]); // bottom to top.
            if (++l > r) break;
        }
        return res;

    }

}
