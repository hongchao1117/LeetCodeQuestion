package Test;

public class Test {
    public static void main(String[] args) {
        String s = "hongchao";
        System.out.println(ReverseString(s));
    }

    private static String ReverseString(String s) {
        if (s == null || s.length()<=1)
            return s;
        else
            return ReverseString(s.substring(1)) + s.charAt(0);
    }

}
