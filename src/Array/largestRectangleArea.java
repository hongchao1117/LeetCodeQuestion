package Array;

public class largestRectangleArea {
    public int largestRectangleArea(int[] heights) {
        int res = 0,len = heights.length;
        for (int i = 0; i < len; i++) {
            int h = heights[i],l = i,r = i,w = 1;
            while (--l>=0 && h<=heights[l]){
                w++;
            }
            while (++r<len && h<=heights[r]){
                w++;
            }
            res = Math.max(res,w*h);
        }
        return res;
    }
}
