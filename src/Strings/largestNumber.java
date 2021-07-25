package Strings;

import java.util.Arrays;

public class largestNumber {

    public static void main(String[] args) {
        String s1 = "23", s2 = "23";
        System.out.println(s2.compareTo(s1));
    }

    public String largestNumber(int[] nums) {
        String[] strings = new String[nums.length];
        int len = strings.length;
        for (int i = 0; i < len; i++) {
            strings[i] = String.valueOf(nums[i]);
        }
        String res = "";
        Arrays.sort(strings, ((o1, o2) -> (o2 + o1).compareTo(o1 + o2)));
        for (String string : strings) {
            res += string;
        }
        if (res.charAt(0) == '0') res = "0";
        return res;

    }
}
