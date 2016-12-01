package ReflectTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Mccree on 01/12/2016.
 */
public class Main {

    public static A a = new A();

    public static void main(String[] args) {
//        getPackageName();
//        printMethod();
        printSuperClass();
    }

    private static void printSuperClass() {
        try {
            Class<?> test = Class.forName("ReflectTest.A"); //一定要带包名
            Class<?> superTest = test.getSuperclass();
            System.out.println(superTest.getName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static void printMethod() {

        Class a2 = a.getClass();
        try {
            Method method = a2.getMethod("sayHello");
            method.invoke(a2); //a(实例) 或 a2(Class) 都能运行
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void getPackageName() {
        Class classA = a.getClass();
        String classAName = classA.getName();
        System.out.println(classAName);//ReflectTest.A

    }
}
