package Test;

import java.util.Scanner;

public class JavaPreTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int len = str.length();
        int count = 0;
        char [] strArr = str.toCharArray();
        final int MOD = 1000000001;
        int leftCountP[] = new int[len];
        for(int i=0;i<len;i++) {
            if(i>0) {
                leftCountP[i] = leftCountP[i-1];
            }
            if(strArr[i] == 'P') {
                leftCountP[i]++;
            }
        }
        int rightConut_U = 0;
        for(int i = len - 1;i >= 0;i--) {
            if(strArr[i] == 'U') {
                rightConut_U ++;
            }else if(strArr[i] == 'K') {
                count = (count + leftCountP[i]*rightConut_U)%MOD;
            }
        }
        System.out.println("统计个数"+count);
        input.close();

    }
}
