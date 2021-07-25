package Strings;

public class reorganizeString {
    public String reorganizeString(String s) {
        int len = s.length();
        if (len < 2) return s;
        int[] count = new int[26];
        int max = 0;
        for (int i = 0; i < len; i++) {
            int index = s.charAt(i) - 'a';
            count[index]++;
            max = Math.max(count[index], max);
        }
        if (max > len / 2) return "";
        char[] chars = new char[len];
        int evenIndex = 0, oddIndex = 1;
        int halfIndex = len / 2;
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            while (count[i] > 0 && count[i] <= halfIndex && oddIndex < len) {
                chars[oddIndex] = ch;
                count[i]--;
                oddIndex += 2;
            }
            while (count[i] > 0) {
                chars[evenIndex] = ch;
                count[i]--;
                evenIndex += 2;
            }
        }
        return new String(chars);
    }
}
