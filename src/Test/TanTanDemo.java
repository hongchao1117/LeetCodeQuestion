package Test;

/**
 * 给你一个 m x n 的矩阵 board ，由若干字符 'X' 和 'O' ，找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
 * 输入：board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]
 * 输出：[["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]
 * 解释：被围绕的区间不会存在于边界上，换句话说，任何边界上的 'O' 都不会被填充为 'X'。
 * 任何不在边界上，或不与边界上的 'O' 相连的 'O' 最终都会被填充为 'X'。如果两个元素在水平或垂直方向相邻，则称它们是“相连”的。
 * [["X","X","X","X"],["X","O","O","X"],["X","O","O","X"],["X","O","X","X"]]
 */
public class TanTanDemo {
    public static void main(String[] args) {
        String[][] board = {{"X", "X", "X", "X"}, {"X", "O", "O", "X"}, {"X", "O", "O", "X"}, {"X", "O", "X", "X"}};
        String[][] matrix = updateMatrix(board);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }

    private static String[][] updateMatrix(String[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        //对上下边界的‘O’进行dfs
        for (int i = 0; i < m; i++) {
            dfs(matrix, 0, i);
            dfs(matrix, n - 1, i);
        }
        //对左右边界的‘O’进行dfs
        for (int i = 0; i < n; i++) {
            dfs(matrix, i, 0);
            dfs(matrix, i, m - 1);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j].equals("V")) {
                    matrix[i][j] = "O";
                } else if (matrix[i][j].equals("O")) {
                    matrix[i][j] = "X";
                }
            }
        }
        return matrix;
    }

    private static void dfs(String[][] matrix, int x, int y) {
        if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length || !matrix[x][y].equals("O")) {
            return;
        }
        matrix[x][y] = "V"; //表示已经遍历
        dfs(matrix, x - 1, y);
        dfs(matrix, x + 1, y);
        dfs(matrix, x, y + 1);
        dfs(matrix, x, y - 1);
    }
}
