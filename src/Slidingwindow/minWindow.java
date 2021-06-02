package Slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class minWindow {
    public String minWindow(String s, String t) {
        int[] mp = new int[256];
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
}
