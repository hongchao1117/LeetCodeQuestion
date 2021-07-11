package dp;

public class countSubstrings {
    public int countSubstrings_dp(String s) {
        if (s == null) {
            return 0;
        }
        int count = 0, len = s.length();
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

    int num = 0;

    public int countSubstrings(String s) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            count(s, i, i);
            count(s, i, i + 1);
        }
        return num;
    }

    private void count(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            num++;
            left--;
            right++;
        }
    }

}
