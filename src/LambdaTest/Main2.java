package LambdaTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Mccree on 19/12/2016.
 */
public class Main2 {
    public static void main(String[] args) {
//        a();
//        b();
//        c();
        d();
    }


    private static void d() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        //old way
        int sum = 0;
        for (Integer n : list) {
            int x = n * n;
            sum = sum + x;
        }
        System.out.println(sum);
        //new way
        int sum2 = list.stream().map(x -> x * x).reduce((x, y) -> x + y).get();
        System.out.println(sum2);
    }

    private static void c() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        //old way
        for (Integer n : list) {
            int x = n * n;
            System.out.println(x);
        }

        //new way
        list.stream().map((x) -> x * x).forEach(System.out::println);
    }

    private static void b() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        //old way
        for (Integer n : list) {
            System.out.println(n);
        }

        //new way
        list.forEach(n -> System.out.println(n));

        //or we can use :: double colon operator in Java 8
        //全新的双冒号(::)操作符将一个常规方法转化为 Lambda 表达式
        list.forEach(System.out::println);

    }

    private static void a() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello from thread");
            }
        }).start();

        new Thread(
                () -> System.out.println("hello from lambda thread")
        ).start();
    }

}
