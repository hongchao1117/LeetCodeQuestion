package Stack;

import java.util.Scanner;
import java.util.Stack;

public class removeDuplicatesTest {
    public static void main(String[] args) {
        String S = "abbaca";
        String string = null;
        Stack<Character> stack = new Stack<>();
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (stack.size() == 0) {
                stack.push(chars[i]);
            } else {
                if (stack.contains(chars[i]))
                    stack.pop();
                else
                    stack.push(chars[i]);
            }
        }



//    private static String removeDuplicates(String s) {
//        Stack<Character> stack = new Stack<>();
//        char[] chars = s.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (stack.size() == 0){
//                stack.push(chars[i]);
//            }else{
//                if (chars[i] == chars[i-1])
//                    stack.pop();
//                else
//                    stack.push(chars[i]);
//            }
//        }
//        return stack.toString();
//    }
    }
}