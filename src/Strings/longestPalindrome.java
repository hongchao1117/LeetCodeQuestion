package Strings;

import java.sql.SQLOutput;

public class longestPalindrome {
    public static void main(String[] args) {
        new T().method();
    }



//    public static String longestPalindrome(String s) {
       /** int len = s.length();
        String res ="";
        boolean[] dp = new boolean[len];
        for (int i = len-1; i >=0 ; i--) {
            for (int j = len-1; j >= i; j--) {
                dp[j] = s.charAt(i)==s.charAt(j)&&(j-i<3||dp[j-1]);
                    if (dp[j] && j-i+1 >res.length()){
                        res = s.substring(i,j+1);
                    }
                }
            }

        return res;**/

     static   class T{
           String string = "hongchao";

           void method(){
               System.out.println(string);
           }

       }

}
