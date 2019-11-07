package Array;

//给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。
//
//找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
public class solve {
    public void solve(char[][] board) {
        for (int i = 0; i < board.length; i++) {//行
            for (int j = 0; j < board[i].length; j++) {//列
                if (i==0)
                    continue;
                else if ((i<board.length-1) && (j==0 || j==board[i].length-1))
                    continue;
                else if (i==board.length-1)
                    continue;
                else {
                    if (board[i][j]=='O'){
                        board[i][j] = 'X';
                    }
                }


            }
        }
    }
}
