package Mathmatics;

public class mySqrt {
    public int mySqrt(int x) {
        if (x == 1) return 1;
        int max = x, min = 0;
        while (max - min > 1) {
            int m = (max + min) / 2;
            if (x / m < m) {
                max = m;
            } else {
                min = m;
            }
        }
        return min;
    }
}
