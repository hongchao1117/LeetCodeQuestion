package Strings;

public class reverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        if (s==null || s.length()<=n) return s;
        return s.substring(n)+s.substring(0,n);
    }
}
