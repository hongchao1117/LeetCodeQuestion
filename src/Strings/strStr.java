package Strings;

public class strStr {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length())
            return -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.length() - i >= needle.length() && haystack.startsWith(needle, i)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
