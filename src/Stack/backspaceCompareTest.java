package Stack;

import java.util.Stack;

public class backspaceCompareTest {
    public static void main(String[] args) {

    }

    public boolean backspaceCompare(String S, String T) {
        char[] chars1 = S.toCharArray();
        char[] chars2 = T.toCharArray();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        PushStack(chars1,stack1);
        PushStack(chars2,stack2);
        return stack1.equals(stack2);

    }


    public void PushStack(char[] chars,Stack<Character> stack){
        for (int i = 0; i <chars.length; i++) {
            if (chars[i]=='#'){
                if (!stack.isEmpty())
                    stack.pop();
            }else{
                stack.push(chars[i]);
            }
        }
    }
}
