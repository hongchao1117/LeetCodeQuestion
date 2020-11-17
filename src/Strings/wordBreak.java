package Strings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，
 * 判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
 */
public class wordBreak {
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        wordBreak(s,wordDict);
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
//        //可以类比背包问题
        int len = s.length();
        boolean[] flag = new boolean[len+1];
        flag[0] = true;
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                if (flag[j] && wordDict.contains(s.substring(j,i))){
                    flag[i] = true;
                    break;
                }
            }
        }
        return flag[len];

    }
}
