package Test;

/**
 * Pin Xiong对所有人 06:31 PM
 * 题目：给你一个字符串 s，找到 s 中最长的回文子串。
 * <p>
 * 示例：
 * <p>
 * 输入：s = "babad"
 * <p>
 * 输出："bab"
 * <p>
 * 解释："aba" 同样是符合题意的答案。
 */
public class xiechengDemo {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(getPaliString(s));
    }

    public static String getPaliString(String s) {
        if (s == null || s.length() <= 1) return s;
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        String res = "";
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1]);
                if (dp[i][j] && res.length() < j - i + 1) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
}
