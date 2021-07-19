package Strings;

/**
 * 给定一组字符，使用原地算法将其压缩。
 * <p>
 * 压缩后的长度必须始终小于或等于原数组长度。
 * <p>
 * 数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
 * <p>
 * 在完成原地修改输入数组后，返回数组的新长度。
 */
public class compress {
    public int compress(char[] chars) {
        int l = 0, r = 0, len = chars.length;
        int count = 0;
        while (r < len) {
            while (r < len && chars[l] == chars[r]) {
                r++;
            }
            chars[count++] = chars[l];
            if (r - l > 1) {
                for (char c : String.valueOf(r - l).toCharArray()) {
                    chars[count++] = c;
                }
            }
            l = r;
        }
        return count;
    }
}
