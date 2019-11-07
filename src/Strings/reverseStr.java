package Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class reverseStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(reverseString(s));
    }

    private static String reverseString(String s) {
        List<Character> list = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (int i = chars.length-1; i >=0 ; i--) {
            list.add(chars[i]);
        }
        return list.toString();
    }

}
