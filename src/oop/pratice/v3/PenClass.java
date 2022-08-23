package oop.pratice.v3;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface PenClass {
    String name() default "oop.study.v1.BallPen";
}
