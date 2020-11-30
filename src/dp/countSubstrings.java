package dp;

import java.util.Arrays;

public class countSubstrings {
    public int countSubstrings(String s) {
        if (s == null) {
            return 0;
        }
        int count = 0, len = s.length();
        /** boolean[][] dp = new boolean[len][len];
         //外层循环要倒着写，内层循环要正着写，求dp[i][j]需要知道dp[i+1][j-1]
         for (int i = len - 1; i >= 0; i--) {
         for (int j = i; j < len; j++) {
         if (s.charAt(i)==s.charAt(j) && (j-i<=2 || dp[i+1][j-1])){
         dp[i][j] =true;
         count++;
         }
         }
         }
         return count; */
        boolean[] dp = new boolean[len];
        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j >= i; j--) {
                dp[j] = s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[j - 1]);
                if (dp[j]) {
                    count++;
                }
            }
        }
        return count;
    }

}
