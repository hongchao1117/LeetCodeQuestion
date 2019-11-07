package GreedyAlo;

import java.util.Arrays;

public class findContentChildrenTest {
    public static void main(String[] args) {
        int[] g = new int[]{10,9,8,7,2,3,5,4,6};
        int[] s = new int[]{5,6,8,7,9,4,6,3};

        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;
        for (int i = 0,j = 0; i < s.length && j <g.length;) {
            if (s[i] == g[j]){
                i++;
                j++;
                count++;
            }else if (s[i] > g[j]){
                j ++;
            }else
                i++;
        }
        System.out.println(count);

    }

//    private static boolean isEquals(int i, int[] s) {
//        boolean flag = false;
//        for (int j = 0; j < s.length; j++) {
//            if (i == s[j]) {
//                flag = true;
//                break;
//            }
//        }
//        return flag;
//    }
}
