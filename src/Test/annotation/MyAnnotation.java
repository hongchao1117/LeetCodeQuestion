package Test.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD})
@Documented
public @interface MyAnnotation {
    String name() default "hong chao";
    int age() default 18;
    int[] score() default {0};
}
