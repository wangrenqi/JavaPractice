package AnnotationTest.Demo2;

import java.lang.reflect.Method;

/**
 * Created by Mccree on 04/12/2016.
 */
public class ReflectProcessor {

    public void parseMethod(final Class<?> clazz) throws Exception {
        final Object obj = clazz.getConstructor(new Class[]{}).newInstance(new Object[]{});
        final Method[] methods = clazz.getDeclaredMethods();
        for (final Method method : methods) {
            final Reflect my = method.getAnnotation(Reflect.class);
            if (null != my) {
                method.invoke(obj, my.name());
            }
        }
    }

}
