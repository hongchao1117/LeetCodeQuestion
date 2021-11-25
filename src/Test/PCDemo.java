package Test;

public class PCDemo {
    public static void main(String[] args) {
        System.out.println(reverseWords("hello world "));
    }

    public static String reverseWords(String s) {
        if (s == null || s.length() == 0) return s;
        StringBuilder res = new StringBuilder();
        int j = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                while (!Character.isLetter(s.charAt(j))) {
                    j--;
                }
                res.append(s.charAt(j--));
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}
