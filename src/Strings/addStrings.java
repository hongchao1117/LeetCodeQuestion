package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class addStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();

        Object[] objects = s.split("");
        System.out.println(Arrays.toString(objects));

    }
}
