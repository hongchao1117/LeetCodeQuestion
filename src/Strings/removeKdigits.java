package Strings;

/**
 * 给你一个以字符串表示的非负整数 num 和一个整数 k ，
 * 移除这个数中的 k 位数字，使得剩下的数字最小。
 * 请你以字符串形式返回这个最小的数字。
 */
public class removeKdigits {
    public static void main(String[] args) {
        String res = removeKDigits("1432219", 3);
        System.out.println(res);
    }

    public static String removeKDigits(String num, int k) {
        StringBuilder s = new StringBuilder(num);
        for (int i = 0; i < k; i++) {
            int index = 0;
            for (int j = 1; j < s.length() && s.charAt(j) >= s.charAt(j - 1); j++) {
                index = j;
            }
            s.delete(index, index + 1);
            while (s.length() > 1 && s.charAt(0) == '0') s.delete(0, 1);
        }
        return "".equals(s.toString()) ? "0" : s.toString();
    }
}
