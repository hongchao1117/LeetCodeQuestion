package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 从字符串中找出一个最长的不包含重复字符的子字符串，
 * 计算该最长子字符串的长度。
 */
public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length()==0 || s==null)
            return 0;
        int count = 1;
       /** int size = s.length();
        int i = 0,j,k,max =0;
        for (j=0;j<size;j++){
            for (k=i;k<j;k++)
                if (s.charAt(k)==s.charAt(j)){
                    i = k+1;
                    break;
                }
                if (j-i+1>max)
                    max = i+j-1;
        }
        return max;*/
        Set<Character> set = new HashSet<>();
        for (int l = 0,r = 0;r < s.length(); r++) {
            while (set.contains(s.charAt(r))){
                set.remove(s.charAt(l++));
            }
            set.add(s.charAt(r));
            count = Math.max(set.size(),count);
        }
        return count;
    }
}
