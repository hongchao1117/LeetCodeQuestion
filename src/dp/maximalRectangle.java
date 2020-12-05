package dp;

public class maximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return 0;
        int[] heights = new int[matrix[0].length];
        int maxArea = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == '1') {
                    heights[j]++;
                } else {
                    heights[j] = 0;
                }
            }
            maxArea = Math.max(maxArea, largestArea(heights));
        }
        return maxArea;
    }

    private int largestArea(int[] heights) {
        int res = 0, len = heights.length;
        for (int i = 0; i < len; i++) {
            int h = heights[i], l = i, r = i, w = 1;
            while (--l >= 0 && h <= heights[l]) {
                w++;
            }
            while (++r < len && h <= heights[r]) {
                w++;
            }
            res = Math.max(res, w * h);
        }
        return res;
    }

}
