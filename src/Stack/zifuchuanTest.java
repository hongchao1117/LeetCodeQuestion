package Stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */
public class zifuchuanTest {
    public static void main(String[] args) {
        String s = "()";
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack();
        for (int i = 0; i < c.length; i++) {
            if (stack.size() == 0){
                stack.push(c[i]);
            }else if (isSame(stack.peek(),c[i])){
                stack.pop();
            }else{
                stack.push(c[i]);
            }
        }
        System.out.println(stack.empty());
    }

    private static boolean isSame(char peek, char c) {
        return (peek=='('&& c==')')||(peek=='['&& c==']')||(peek=='{'&& c=='}');
    }
}