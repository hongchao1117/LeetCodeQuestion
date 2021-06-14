package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class addStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();

        Object[] objects = s.split("");
        System.out.println(Arrays.toString(objects));

    }

    public String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        int carry = 0, i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                carry += num1.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry += num2.charAt(j--) - '0';
            }
            stringBuilder.append(carry % 10);
            carry /= 10;
        }
        return stringBuilder.reverse().toString();
    }


}
