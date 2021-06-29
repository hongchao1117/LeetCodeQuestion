package Backtracking;

/**
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。
 * 一个数字可能有多个翻译。
 * 请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 */
public class translateNum {
    public int translateNum(int num) {
        return dfs(String.valueOf(num), 0);
    }

    private int dfs(String value, int index) {
        if (index >= value.length() - 1) {
            return 1;
        }
        int res = dfs(value, index + 1);
        String subStr = value.substring(index, index + 2);
        if (subStr.compareTo("10") >= 0 || subStr.compareTo("25") <= 0) {
            res += dfs(subStr, index + 2);
        }
        return res;
    }
}
