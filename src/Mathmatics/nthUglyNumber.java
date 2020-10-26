package Mathmatics;

/**
 * 我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。
 * 求按从小到大的顺序的第 n 个丑数。
 */
public class nthUglyNumber {
    public int nthUglyNumber(int n) {
        if (n<=0) return -1;
        /** 存放数组，数组的最后一个数就是所求的 丑数*/
        int[] dp = new int[n];
        int index_2 = 0,index_3 = 0,index_5 = 0;
        for (int i = 0; i < n; i++) {
            if (i==0){
                dp[i] = 1;
                continue;
            }
            dp[i] = Math.min(dp[index_2]*2,Math.min(dp[index_3]*3,dp[index_5]*5));
            if (dp[i] ==dp[index_2]*2 ) index_2++;
            if (dp[i] ==dp[index_3]*3 ) index_3++;
            if (dp[i] ==dp[index_5]*5 ) index_5++;
        }
        return dp[n-1];

    }
}
