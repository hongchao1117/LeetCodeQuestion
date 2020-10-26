package Array;

public class movingCount {
    public int movingCount(int m, int n, int k) {
        int[][] flag = new int[m][n];
        return helper(0,0,m,n,k,flag);
    }

    private int helper(int i, int j, int m, int n, int k, int[][] flag) {
        if (i<0||i>=m || j<0||j>=n||flag[i][j]==1||(sum(i)+sum(j))>k) return 0;
        flag[i][j] = 1;
        return helper(i+1,j,m,n,k,flag)
                +helper(i,j+1,m,n,k,flag)
                +helper(i-1,j,m,n,k,flag)
                +helper(i,j-1,m,n,k,flag) +1;

    }

    private  int sum(int i) {
        int count = 0;
        while (i>0){
            count+= i%10;
            i /= 10;
        }
        return count;

    }


}
