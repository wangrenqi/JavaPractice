package AnnotationTest.Demo3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Mccree on 04/12/2016.
 */

//  水果供应者注解

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FruitProvider {
    //    供应商编号
    int id() default -1;

    //    供应商名称
    String name() default "";

    //    供应商地址
    String address() default "";
}
