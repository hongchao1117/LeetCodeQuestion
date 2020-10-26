package Strings;

import java.util.ArrayList;
import java.util.Collections;

public class reverseWords {
    public static void main(String[] args) {
        String s = "hello world!";
        System.out.println(reverseWords(s));
    }

    public static  String reverseWords(String s) {
        String[] strings = s.trim().split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = strings.length-1; i>=0; i--) {
            if (strings[i].length()>0)
                list.add(strings[i]);

        }
        return String.join(" ",list);
    }
}
