package Test;

/**
 * 1! + 2! + ... + N!
 */
public class ErrsionDemo {

    public static void main(String[] args) {
        System.out.println(getRes(10));
    }

    public static long getRes(long n) {
        long sum = 0;
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a *= i;
            sum += a;
        }
        return sum;
    }

//    private static long helper(long num) {
//        if (num <= 1) {
//            return 1;
//        } else {
//            return num * helper(num - 1);
//        }
//    }
}
