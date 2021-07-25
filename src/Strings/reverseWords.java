package Strings;

import java.util.Arrays;
import java.util.Collections;

public class reverseWords {
    public static void main(String[] args) {
        String s = "hello                    world!";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
//        String[] strings = s.trim().split(" ");
//        ArrayList<String> list = new ArrayList<>();
//        for (int i = strings.length-1; i>=0; i--) {
//            if (strings[i].length()>0)
//                list.add(strings[i]);
//
//        }
//        return String.join(" ",list);
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    /**
     * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
     *
     * @param s
     * @return
     */
    public String reverseWordsIII(String s) {
        if (s == null || s.length() == 0) return s;
        String[] strings = s.split(" ");
        int len = strings.length;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            stringBuilder.append(new StringBuilder(strings[i]).reverse());
            stringBuilder.append(" ");
        }
        return  stringBuilder.toString().trim();
    }
}
