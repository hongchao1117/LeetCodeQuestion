package Array;

public class maximumSwap {
    public static void main(String[] args) {
        int num = 2736;
        maximumSwap(num);
    }

    public static int maximumSwap(int num) {
        if (num == 0) return 0;
        char[] chars = String.valueOf(num).toCharArray();
        int[] maxIndex = new int[chars.length];
        int max = chars.length - 1;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] - '0' > chars[max] - '0') {
                max = i;
            }
            maxIndex[i] = max;
        }
        for (int i = 0; i < chars.length; i++) {
            int value = chars[i] - '0';
            int maxValue = chars[maxIndex[i]] - '0';
            if (maxValue != value) {
                chars[i] = (char) (maxValue + '0');
                chars[maxIndex[i]] = (char) (value + '0');
                break;
            }
        }
        return Integer.parseInt(new String(chars));
    }
}
