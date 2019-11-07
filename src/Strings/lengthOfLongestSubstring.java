package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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
        Map<Character,Integer> map = new HashMap<>();
        for (int j = 0, i = 0; j < s.length(); j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            count = Math.max(count, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return count;
    }
}
