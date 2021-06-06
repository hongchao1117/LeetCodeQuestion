package Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 * <p>
 * 例如，给出 n = 3，生成结果为：
 * <p>
 * [
 * "((()))",
 * "(()())",
 * "(())()",
 * "()(())",
 * "()()()"
 * ]
 */
public class generateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(res, "", 0, 0, n);
        return res;
    }

    private void generate(List<String> res, String s, int count1, int count2, int n) {
        if (count1 > n || count2 > n)//返回上一层递归 或 直接返回
            return;
        if (count1 == n && count2 == n)
            res.add(s);
        if (count1 >= count2) {
            String string = new String(s);
            generate(res, s + "(", count1 + 1, count2, n);
            generate(res, string + ")", count1, count2 + 1, n);
        }

    }
}
