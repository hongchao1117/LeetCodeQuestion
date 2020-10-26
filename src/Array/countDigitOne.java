package Array;

public class countDigitOne {
    public int countDigitOne(int n) {
        int count = 0;
        long i = 1;        // 从个位开始遍历到最高位
        while(n / i != 0) {
            long high = n / (10 * i);  // 高位
            long cur = (n / i) % 10;   // 当前位
            long low = n - (n / i) * i;
            if(cur == 0) {
                count += high * i;
            }else if(cur == 1) {
                count += high * i + (low + 1);
            }else {
                count += (high + 1) * i;
            }
            i = i * 10;
        }
        return count;
    }

}
