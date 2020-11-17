package Strings;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 给你一个字符串 s 、一个字符串 t 。
 * 返回 s 中涵盖 t 所有字符的最小子串。
 * 如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
 */
public class minWindow {
    public String minWindow(String s, String t) {
        if (s.length()==0||t.length()>s.length()) return "";
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <t.length(); i++) {
            char c=t.charAt(i);
            map.put(c, map.getOrDefault(c, 0) +1);
        }
        int count=0;
        HashMap<Character,Integer> map1=new HashMap<>();
        int left =0,right=0,start=-1;

        int len=Integer.MAX_VALUE;
        while (right<s.length()){
            char tmp=s.charAt(right);
            right++;
            if (map.containsKey(tmp)){
                map1.put(tmp,map1.getOrDefault(tmp,0)+1);
                if (map.get(tmp).intValue() == map1.get(tmp).intValue()){
                    count++;
                }
            }

            while (count==map.size()){
                if (len>right-left){
                    len=right-left;
                    start=left;
                }
                char tmp1=s.charAt(left);
                if (map.containsKey(tmp1)){
                    if (map.get(tmp1).intValue()==map1.get(tmp1).intValue()){
                        count--;
                    }
                    map1.put(tmp1,map1.get(tmp1).intValue()-1);
                }
                left++;
            }
        }
        return len == Integer.MAX_VALUE ?
                "" : s.substring(start, start+len);
    }
}
