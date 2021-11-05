package Strings;

/**
 * 给你一个以字符串表示的非负整数 num 和一个整数 k ，
 * 移除这个数中的 k 位数字，使得剩下的数字最小。
 * 请你以字符串形式返回这个最小的数字。
 */
public class removeKdigits {
    public static void main(String[] args) {
        String res = removeKDigits_max("441", 1);
        System.out.println(res);
    }

    /**
     * 成为最小数
     *
     * @param num
     * @param k
     * @return
     */
    public static String removeKDigits(String num, int k) {
        if (num.length() == k) return "0";
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < k; i++) {
            int index = 0;
            for (int j = 1; j < sb.length() && sb.charAt(j) >= sb.charAt(j - 1); j++) {
                index = j;
            }
            sb.delete(index, index + 1);
            while (sb.length() > 1 && sb.charAt(0) == '0') {
                sb.delete(0, 1);
            }
        }
        return "".equals(sb.toString()) ? "0" : sb.toString();
    }

    /**
     * 成为最大数
     *
     * @param num
     * @param k
     * @return
     */
    public static String removeKDigits_max(String num, int k) {
        if (num.length() == k) return "0";
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < k; i++) {
            int index = 0;
            for (int j = 1; j < sb.length() && sb.charAt(j) <= sb.charAt(j - 1); j++) {
                index = j;
            }
            sb.delete(index, index + 1);
            while (sb.length() > 1 && sb.charAt(0) == '0') {
                sb.delete(0, 1);
            }
        }
        return "".equals(sb.toString()) ? "0" : sb.toString();
    }

}
