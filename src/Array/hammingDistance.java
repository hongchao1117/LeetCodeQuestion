package Array;

public class hammingDistance {
    public int hammingDistance(int x, int y) {
//        int count = 0;
//        int z = x ^ y;
//        while (z != 0) {
//            z = z & (z - 1);
//            count++;
//        }
//        return count;
        return Integer.bitCount(x ^ y);
    }
}
