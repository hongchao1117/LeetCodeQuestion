package Strings;

/**
 * 给定一个字符串，验证它是否是回文串，
 * 只考虑字母和数字字符，可以忽略字母的大小写。
 */
public class isPalindrome {
    public boolean isPalindrome(String s) {
        if (s==null) return true;
        String string = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (char c : string.toCharArray()) {
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                sb.append(c);
            }
        }
        return sb.reverse().toString().equals(sb.toString());
    }
}
