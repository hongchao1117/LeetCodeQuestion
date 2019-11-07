package Stack;

import java.util.Stack;

public class longestValidParentheses {
    public static void main(String[] args) {
        String s = ")()())";
        System.out.println(longestValidParentheses(s));
    }

    public static int longestValidParentheses(String s) {
        if (s.length()==0 || s==null)   return 0;
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (stack.isEmpty()){
                stack.push(chars[i]);
            }else if (isCouple(stack.peek(),chars[i])){
                stack.pop();
                count++;
            }else
                stack.push(chars[i]);
        }
        return 2*count;

    }

    private static boolean isCouple(Character peek, char c) {
        return (peek=='(' && c==')');
    }
}
