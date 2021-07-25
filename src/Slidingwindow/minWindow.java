package Slidingwindow;

public class minWindow {
    public String minWindow(String s, String t) {
        int[] mp = new int[128];
        for (char ch : t.toCharArray()) {
            mp[ch] += 1;
        }
        int start = 0, end = 0;
        int sLen = s.length(), tLen = t.length();
        int count = 0, res = -1;
        String ans = "";
        while (end < sLen) {
            char ch = s.charAt(end);
            mp[ch]--;
            if (mp[ch] >= 0) count++;
            while (count == tLen) {
                if (res == -1 || res > end - start + 1) {
                    ans = s.substring(start, end + 1);
                    res = end - start + 1;
                }
                ch = s.charAt(start);
                mp[ch]++;
                if (mp[ch] >= 1) count--;
                start++;
            }
            end++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String res = minWindow_2("ADOBECODEBANC", "ABC");
        System.out.println(res);
    }

    public static String minWindow_2(String s, String t) {
        char[] chars = s.toCharArray(), chart = t.toCharArray();
        int sLen = chars.length, tLen = chart.length;

        int[] hash = new int[128];
        for (char ch : chart) hash[ch]--;

        String res = "";
        for (int i = 0, j = 0, count = 0; i < sLen; i++) {
            hash[chars[i]]++;
            if (hash[chars[i]] <= 0) count++;
            while (count == tLen && hash[chars[j]] > 0) hash[chars[j++]]--;
            if (count == tLen)
                if (res.equals("") || res.length() > i - j + 1)
                    res = s.substring(j, i + 1);
        }
        return res;
    }

}
