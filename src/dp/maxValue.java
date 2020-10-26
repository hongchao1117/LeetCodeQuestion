package dp;

public class maxValue {
    public int maxValue(int[][] grid) {
        int m = grid.length;//行
        int n =grid[0].length;//列
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n ; j++) {
                if (i==0&& j==0) continue;
                else if (i==0) {
                    grid[i][j] += grid[i][j-1];
                }
                else if (j==0){
                    grid[i][j] += grid[i-1][j];
                }
                else{
                    grid[i][j] += Math.max( grid[i-1][j],grid[i][j-1]);
                }
            }
        }
        return grid[m-1][n-1];
    }
}
