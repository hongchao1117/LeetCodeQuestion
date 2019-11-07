package Tree.test;

import java.util.Scanner;

public class JinZhiZhuanHuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //16进制转为10进制
        System.out.println("16进制转为10进制:");
        String s = input.nextLine();
        long num = Long.parseLong(s,16);
        System.out.println(num);

//        String s = 123+"";
//        String s2 = "123";
//        System.out.println(s.equals(s2));

//        int num = input.nextInt();
//        String s = "";
//        while (num!=0){
//            int hexValue = num%16;
//            char hexDigit =  ((hexValue <=9 && hexValue >=0)?
//                    (char) (hexValue+'0'):(char)(hexValue-10+'A'));
//            s = hexDigit+s;
//            num = num / 16;
//        }
//        System.out.println(s);
    }
}
