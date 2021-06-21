package Strings;

/**
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 * <p>
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */
public class romanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }

    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int roman_int = 0;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'I':
                    roman_int = roman_int + 1;
                    break;
                case 'V':
                    roman_int = roman_int + 5;
                    break;
                case 'X':
                    roman_int = roman_int + 10;
                    break;
                case 'L':
                    roman_int = roman_int + 50;
                    break;
                case 'C':
                    roman_int = roman_int + 100;
                    break;
                case 'D':
                    roman_int = roman_int + 500;
                    break;
                case 'M':
                    roman_int = roman_int + 1000;
                    break;
            }
            if (i > 0) {
                if ((chars[i] == 'V' || chars[i] == 'X') && chars[i - 1] == 'I') {
                    roman_int = roman_int - 2 * 1;
                }
                if ((chars[i] == 'L' || chars[i] == 'C') && chars[i - 1] == 'X') {
                    roman_int = roman_int - 2 * 10;
                }
                if ((chars[i] == 'D' || chars[i] == 'M') && chars[i - 1] == 'C') {
                    roman_int = roman_int - 2 * 100;
                }
            }
        }
        return roman_int;

    }
}
