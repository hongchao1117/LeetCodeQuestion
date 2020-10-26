package Strings;

public class isMatch {
    public boolean isMatch(String s, String p) {
        char[] text = s.toCharArray();
        char[] pattern = p.toCharArray();
        return isMatchHelper(text, 0, pattern, 0);
    }

    private boolean isMatchHelper(char[] text, int tIndex, char[] pattern, int pIndex) {
        //匹配完成
        if (tIndex == text.length && pIndex == pattern.length) {
            return true;
        }
        //未匹配完全
        if (tIndex != text.length && pIndex == pattern.length) {
            return false;
        }
        //当前字符匹配判断
        boolean matchSuc = tIndex < text.length && (pattern[pIndex] == text[tIndex] || pattern[pIndex] == '.');
        if (pattern.length - pIndex >= 2 && pattern[pIndex + 1] == '*') {
            //匹配0次 或 多次
            return isMatchHelper(text, tIndex, pattern, pIndex + 2) || (matchSuc && isMatchHelper(text, tIndex + 1, pattern, pIndex));
        }
        return matchSuc && isMatchHelper(text, tIndex + 1, pattern, pIndex + 1);
    }
}
