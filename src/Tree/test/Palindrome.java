package Tree.test;

import java.util.Scanner;

/**
 * 回文判断
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String string = input.next();

        //开头字母下标
        int begin = 0;
        //结束字母下标
        int end = string.length() - 1;
        boolean flag = true;
        while (begin < end) {
            if (string.charAt(begin) != string.charAt(end)) {
                flag = false;
                break;
            }
            begin++;
            end--;
        }
        if(flag){
            System.out.println(string+"是回文字符串");
        }else{
            System.out.println(string+"不是回文字符串");
        }
    }
}
