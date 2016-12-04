package AnnotationTest.Demo3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Mccree on 04/12/2016.
 */

//水果颜色注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitColor {
//    颜色枚举
    enum Color{ BLUE, RED, GREEN};

    //    颜色属性
    Color fruitColor() default Color.GREEN;
}
