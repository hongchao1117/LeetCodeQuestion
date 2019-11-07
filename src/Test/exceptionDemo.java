package Test;

import java.util.ArrayList;

public class exceptionDemo {
    public static void main(String[] args) {
//        Integer a = 1,b = 1;
//        Integer c = 100,d = 100;
//        System.out.println(a==b);
//        System.out.println(c==d);
        ArrayList<Integer> list = new ArrayList<>();


    }

    static class exceptionInstance{
        void A(){
            try {
                method1();
                System.out.println("A");
            }catch (Exception e){
                System.out.println("B");
            }finally {
                System.out.println("C");
            }
        }
    }

    private static void method1() {
        try {
            int a = 1,b = 0;
            int c = a/b;
            System.out.println("1");
        }catch (Exception e){
            System.out.println("2");
        }finally {
            System.out.println("3");
        }
    }
}
