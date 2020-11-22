package Strings;

import java.lang.reflect.AnnotatedArrayType;
import java.util.Stack;

public class decodeString {
    public static void main(String[] args) {
        String string = "3[a]2[bc]";
        System.out.println(decodeString(string));

    }

    public static String decodeString(String s) {
        if (s == null || s.length() == 0) return s;
        StringBuilder ans = new StringBuilder();
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> resStack = new Stack<>();
        int temp = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                temp = temp * 10 + (ch - '0');
            } else if (ch == '[') {
                resStack.push(ans);
                numStack.push(temp);
                ans = new StringBuilder();
                temp = 0;
            } else if (Character.isAlphabetic(ch)) {
                ans.append(ch);
            } else {
                StringBuilder tempString = resStack.pop();
                int num = numStack.pop();
                for (int i = 0; i < num; i++) {
                    tempString.append(ans);
                }
                ans = tempString;
            }
        }
        return ans.toString();
    }
}
