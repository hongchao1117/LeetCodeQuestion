package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class largestPerimeterTest {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,3,4};
        Arrays.sort(arr);

        for(int i = arr.length-1;i>=2 ;i--){
            int a = arr[i];
            int b = arr[i-1];
            int c = arr[i-2];
            if (a < b + c){
                System.out.println(a+b+c);
                break;
            }
        }


    }



}
