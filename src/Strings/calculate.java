package Strings;

import java.util.Stack;

public class calculate {

    public static void main(String[] args) {
        String s = "3+2*2";
        int res = calculate(s);
        System.out.println(res);

    }

    public static int calculate(String s) {
        //保存上一个字符，初始为 +
        char sign = '+';
        Stack<Integer> numStack = new Stack<>();
        int num = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur >= '0') {
                num = num * 10 - '0' + cur;
            }
            if (cur < '0' && cur != ' ' || i == s.length() - 1) {
                switch (sign) {
                    case '+':
                        numStack.push(num);
                        break;
                    case '-':
                        numStack.push(-num);
                        break;
                    case '*':
                        numStack.push(numStack.pop() * num);
                        break;
                    case '/':
                        numStack.push(numStack.pop() / num);
                        break;
                }
                sign = cur;
                num = 0;
            }
        }
        while (!numStack.isEmpty()) {
            result += numStack.pop();
        }
        return result;
    }
}
