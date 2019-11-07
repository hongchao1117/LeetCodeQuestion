package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class partition {
    public static void main(String[] args) {
        System.out.println(partition("aab"));
    }

    public static List<List<String>> partition(String s) {
        return partitionHelper(s,0);
    }

    private static List<List<String>> partitionHelper(String s, int start) {
        //递归出口
        if (start==s.length()){
            List<String> list = new ArrayList<>();
            List<List<String>> res = new ArrayList<>();
            res.add(list);
            return res;
        }
        List<List<String>> res = new ArrayList<>();
        for (int i = start; i < s.length(); i++) {
            //当前切割后是回文串才考虑
            if (isPalindrome(s.substring(start,i+1))){
                String left = s.substring(start,i+1);
                //遍历后边字符串的所有结果，将当前的字符串加到头部
                for (List<String> l:partitionHelper(s,i+1)) {
                    l.add(0,left);
                    res.add(l);
                }
            }

        }
        return res;
    }

    private static boolean isPalindrome(String s) {
        int i=0;
        int j = s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
