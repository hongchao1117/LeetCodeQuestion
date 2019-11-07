package Tree.test;

import java.util.HashSet;
import java.util.Scanner;

public class isReapte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int nums[] = new int[num];
        for (int i = 0; i < nums.length; i++)
            nums[i] = input.nextInt();
            System.out.println(isReaptition(nums));

    }

    private static boolean isReaptition(int[] nums) {
        HashSet set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            boolean isSet = set.add(nums[i]);
            if (!isSet){
                return true;
            }
        }
        return false;
    }
}
