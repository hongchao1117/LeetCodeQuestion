package Strings;

import java.util.*;

/**
 * 删除最小数量的无效括号，使得输入的字符串有效，返回所有可能的结果。
 *
 * 说明: 输入可能包含了除 ( 和 ) 以外的字符。
 *
 * 示例 1:
 *
 * 输入: "()())()"
 * 输出: ["()()()", "(())()"]
 * 示例 2:
 *
 * 输入: "(a)())()"
 * 输出: ["(a)()()", "(a())()"]
 * 示例 3:
 *
 * 输入: ")("
 * 输出: [""]
 *
 */
public class removeInvalidParentheses {
    public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<>();
        if (s.equals("()") || s.equals("")) {
            res.add(s);
            return res;
        }
        Deque<String> queue = new ArrayDeque<>();
        queue.add(s);
        HashSet<String> set = new HashSet<>();
        boolean isFound = false;
        while (!queue.isEmpty()) {
            String cur = queue.poll();
            if (isValided(cur)) {
                res.add(cur);
                isFound = true;
            }
            if (isFound) {
                continue;
            }
            //裁剪过程
            for (int i = 0; i < cur.length(); i++) {
                if (cur.charAt(i) == '(' || cur.charAt(i) == ')') {
                    String str;
                    if (i == cur.length() - 1) {
                        str = cur.substring(0, cur.length() - 1);
                    } else {
                        str = cur.substring(0, i) + cur.substring(i + 1);
                    }
                    if (set.add(str)) {
                        queue.add(str);
                    }
                }
            }
        }
        if (res.isEmpty()) {
            res.add("");
        }
        return res;
    }

    private boolean isValided(String cur) {
        int left = 0;
        for (int i = 0; i < cur.length(); i++) {
            if (cur.charAt(i) == '(') {
                left++;
            } else if (cur.charAt(i) == ')') {
                if (left > 0) {
                    left--;
                } else {
                    return false;
                }
            }
        }
        return left == 0;
    }
}
