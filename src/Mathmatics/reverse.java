package Mathmatics;

public class reverse {
    public static void main(String[] args) {
        int sum = -123;

        System.out.println(reverse(sum));
    }

    public static int reverse(int num) {
        long res = 0L;
        while (num != 0) {
            res = res * 10 + num % 10;
            num /= 10;
        }
        return res > Integer.MAX_VALUE || res < Integer.MIN_VALUE ? 0 : (int) res;
    }
}
