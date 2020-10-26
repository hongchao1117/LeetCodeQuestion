package Mathmatics;

/**
 * a+b = a^b + (a&b)<<1
 */
public class add {
    public int add(int a,int b){
        while(b!=0){//非进位
            int c = (a&b)<<1;
            a ^= b;
            b = c;
        }
        return a;
    }
}
