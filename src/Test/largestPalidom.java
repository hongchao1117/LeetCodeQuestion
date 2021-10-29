package Test;

public class largestPalidom {
    public String getRes(String s) {
        if (s == null || s.length() <= 1) return s;
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        String res = "";
        for (int i = len - 1; i > 0; i--) {
            for (int j = i; j < len; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i > 2 || dp[i + 1][j - 1]);
                if (dp[i][j] && res.length() < j - i + 1) {
                    res = s.substring(i, j + 1);
                }
            }
        }
        return res;
    }
}
