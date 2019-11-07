package Strings;

import java.util.ArrayList;
import java.util.List;

public class isInterleave {
    public boolean isInterleave(String s1, String s2, String s3) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        char[] chars3 = s3.toCharArray();
        if (chars1.length+chars2.length!=chars3.length)
            return false;
        boolean flag = true;
        int j = 0,k=0;
        for (int i = 0; i < chars3.length; i++) {
            if (j<chars1.length && chars3[i]==chars1[j]  ){
                j++;
            }else if (k<chars2.length && chars3[i]==chars2[k] ){
                k++;
            }else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
