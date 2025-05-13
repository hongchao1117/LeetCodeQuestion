package Slidingwindow;

import java.util.HashMap;
import java.util.Map;

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
                if (res.isEmpty() || res.length() > i - j + 1)
                    res = s.substring(j, i + 1);
        }
        return res;
    }

    public String minWindow_map(String s, String t) {
        Map<Character, Integer> needMap = new HashMap<Character, Integer>();
        Map<Character, Integer> windowsMap = new HashMap<Character, Integer>();
        //将目标字符串的所有字符记录到needMap中
        for (char c : t.toCharArray()) {
            needMap.put(c, needMap.getOrDefault(c, 0) + 1);
        }
        //记录窗口的左右边界
        int left = 0, right = 0;
        //记录窗口中符合needMap条件的字符数量
        int valid = 0;
        //记录最小覆盖子串的起始结尾索引和长度
        int start = 0, end = 0, len = Integer.MAX_VALUE;
        while (right < s.length()) {
            //找到入窗口的元素
            char c = s.charAt(right);
            //右移窗口
            right++;
            //更新窗口内的数据
            if (needMap.containsKey(c)) {
                windowsMap.put(c, windowsMap.getOrDefault(c, 0) + 1);
                //如果该字符全部被涵盖，则valid加一
                if (windowsMap.get(c).equals(needMap.get(c))) {
                    valid++;
                }
            }
            //判断左侧窗口是否需要收缩
            while (valid == needMap.size()) {
                //首先更新最小覆盖子串的索引和长度
                //right自增过一次
                if (right - left < len) {
                    len = right - left;
                    start = left;
                }
                //找到出窗口的元素
                char d = s.charAt(left);
                //窗口右移
                left++;
                //更新窗口中的数据
                if (windowsMap.containsKey(d)) {
                    if (windowsMap.get(d).equals(needMap.get(d))) {
                        valid--;
                    }
                    windowsMap.put(d, windowsMap.getOrDefault(d, 0) - 1);
                }
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }

}
