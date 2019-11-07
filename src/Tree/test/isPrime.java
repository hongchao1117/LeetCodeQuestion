package Tree.test;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num<0 || (num%10==0 && num!=0))
            System.out.println(false);
        int revertedNumber = 0;
        while (num>revertedNumber){
            revertedNumber = revertedNumber *10 +num%10;
            num /= 10;
        }

    }
}
