package Test.annotation;

import java.lang.annotation.Annotation;

public class test {
    public static void main(String[] args) throws ClassNotFoundException {
         Class<?> aClass = Class.forName("Test.annotation.demo");
        Annotation[] annotations = aClass.getAnnotations();
        System.out.println(annotations.toString());
    }
}
