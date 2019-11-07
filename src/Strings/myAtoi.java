package Strings;


public class myAtoi {
    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
    }
    public static int myAtoi(String str) {
        String string = str.trim();
        char[] chars = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        long num = 0;
        char temp = chars[0];
            for (int i = 0; i < chars.length; i++) {
                if (i==0){
                    if (temp<'9' || temp>'0' || temp=='+' || temp=='-'){
                        sb.append(chars[i]);
                    }else {
                        return 0;
                    }
                }
            if (i>0){
                if (chars[i]<'9' || chars[i]>'0' && chars[i]!=' '){
                    sb.append(chars[i]);
                }else{
                    break;
                }
            }
        }
        num = Long.valueOf(sb.toString());
        if(num>Integer.MAX_VALUE){
            num = Integer.MAX_VALUE;
        }else if (num<Integer.MIN_VALUE){
            num = Integer.MIN_VALUE;
        }
        return (int)num;
    }
}
