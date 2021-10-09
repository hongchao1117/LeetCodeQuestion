package dp;

/**
 * 一条包含字母 A-Z 的消息通过以下映射进行了 编码 ：
 * <p>
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * 要 解码 已编码的消息，所有数字必须基于上述映射的方法，反向映射回字母（可能有多种方法）。例如，"111" 可以将 "1" 中的每个 "1" 映射为 "A" ，从而得到 "AAA" ，或者可以将 "11" 和 "1"（分别为 "K" 和 "A" ）映射为 "KA" 。注意，"06" 不能映射为 "F" ，因为 "6" 和 "06" 不同。
 * <p>
 * 给你一个只含数字的 非空 字符串 num ，请计算并返回 解码 方法的 总数 。
 */
public class numDecodings {
    public int numDecodings(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        if (chars[0] == '0') return 0;
        int[] dp = new int[len + 1];
        dp[0] = 1;
        for (int i = 0; i < len; i++) {
            dp[i + 1] = chars[i] == '0' ? 0 : dp[i];
            if (i > 0 && (chars[i - 1] == '1' || (chars[i - 1] == '2' && chars[i] <= '6'))) {
                dp[i + 1] += dp[i - 1];
            }
        }
        return dp[len];

    }
}
