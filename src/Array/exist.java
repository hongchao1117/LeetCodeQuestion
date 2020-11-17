package Array;

public class exist {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (searchWord(board,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean searchWord(char[][] board, String word, int i, int j, int index) {
        if (index>=word.length()) return true;
        if (i<0 || i>=board.length || j<0 || j>=board[0].length
                || word.charAt(index)!=board[i][j]) return false;
        //标记访问过的元素
        board[i][j] += 256;
        boolean res = searchWord(board,word,i-1,j,index+1) || searchWord(board,word,i,j-1,index+1)
                || searchWord(board,word,i+1,j,index+1) || searchWord(board,word,i,j+1,index+1);
        board[i][j] -= 256;
        return res;
    }

}
