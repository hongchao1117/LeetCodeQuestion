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
        for (String string:strings){
            if (string.length()>0)
                list.add(string);
        }
        return String.join(" ",list);
    }
}
