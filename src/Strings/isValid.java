package Strings;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'
 * 的字符串，判断字符串是否有效。
 */
public class isValid {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (stack.isEmpty()){
                stack.push(chars[i]);
            }else if (isSym(stack.peek(),chars[i])){
                stack.pop();
            }else {
                stack.push(chars[i]);
            }
        }
        return stack.isEmpty();
    }

    private boolean isSym(Character c1, char c2) {
        return (c1=='(' && c2==')' || c1=='{' && c2=='}' || c1=='[' && c2==']');
    }
}
