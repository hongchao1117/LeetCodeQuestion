package Mathmatics;

import java.util.Collections;

public class reverse {
    public static void main(String[] args) {
        int sum = -123;

        System.out.println(reverse(sum));
    }

    public static int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) ? 0 : (int) res;
    }
}
