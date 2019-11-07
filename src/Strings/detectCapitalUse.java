package Strings;

public class detectCapitalUse {
    public static void main(String[] args) {
        String word = "Alibaba";

        boolean flag = false;
        //判断是否全是大写字母
        if (word.equals(word.toUpperCase())){
            flag = true;
        }
        if (word.equals(word.toLowerCase())){
            flag = true;
        }
        //判断是否是：首字母大写类型
        String s1 = word.substring(0,1);
        String s2 = word.substring(1);
        if (s1.equals(s1.toUpperCase())&&s2.equals(s2.toLowerCase())){
            flag = true;
        }
        System.out.println(flag);



    }
}
