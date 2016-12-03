package AnnotationTest.Demo1;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Mccree on 04/12/2016.
 */

//编写注解处理器
public class UseCaseTracker {
    public static void trackUseCases(List<Integer> list, Class<?> cc) {
        for (Method m : cc.getDeclaredMethods()) {
            UseCase u = m.getAnnotation(UseCase.class);
            if (null != u) {
                System.out.println("Found use case -- " + u.id() + "   " + u.description());
                list.remove(new Integer(u.id()));
            }
        }

        for (int i : list) {
            System.out.println("Warnig !!! : Missing use case - - " + i);
        }
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 47, 18, 22, 59);
        trackUseCases(list, PasswordUtils.class);
    }
}
