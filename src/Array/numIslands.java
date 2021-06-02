package Array;

public class numIslands {
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int islandCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    infectIsland(grid, i, j);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }

    private void infectIsland(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length
                || j < 0 || j >= grid[0].length
                || grid[i][j] != '1') return;
        grid[i][j] = '2';
        infectIsland(grid, i + 1, j);
        infectIsland(grid, i - 1, j);
        infectIsland(grid, i, j - 1);
        infectIsland(grid, i, j + 1);
    }

}
