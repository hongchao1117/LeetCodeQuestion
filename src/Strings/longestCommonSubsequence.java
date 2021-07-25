package Strings;

/**
 * 给定两个字符串 text1 和 text2，返回这两个字符串的最长 公共子序列 的长度。如果不存在 公共子序列 ，返回 0 。
 * <p>
 * 一个字符串的 子序列 是指这样一个新的字符串：它是由原字符串在不改变字符的相对顺序的情况下删除某些字符（也可以不删除任何字符）后组成的新字符串。
 * <p>
 * 例如，"ace" 是 "abcde" 的子序列，但 "aec" 不是 "abcde" 的子序列。
 * 两个字符串的 公共子序列 是这两个字符串所共同拥有的子序列。
 */
public class longestCommonSubsequence {
    //暴力递归，超时
    public int longestCommonSubsequence_recursion(String text1, String text2) {
        return getRes(text1, 0, text2, 0);
    }

    private int getRes(String text1, int i, String text2, int j) {
        if (i >= text1.length() || j >= text2.length()) return 0;
        if (text1.charAt(i) == text2.charAt(j)) {
            return getRes(text1, i + 1, text2, j + 1) + 1;
        } else {
            return Math.max(getRes(text1, i + 1, text2, j), getRes(text1, i, text2, j + 1));
        }
    }

    //dp
    public int longestCommonSubsequence_dp(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[m][n];
    }

}
