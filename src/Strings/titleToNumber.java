package Strings;

public class titleToNumber {
    public int titleToNumber(String columnTitle) {
        char[] chars = columnTitle.toCharArray();
        int len = chars.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            count = count * 26 + (chars[i] - 'A' + 1);
        }
        return count;
    }
}
