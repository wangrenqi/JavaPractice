package LambdaTest;

import java.util.Arrays;

/**
 * Created by Mccree on 30/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        print();
    }

    private static void print() {

        Arrays.asList("a", "b", "c").sort((e1, e2) -> {
            int result = e1.compareTo(e2);
            return result;
        });

//        Arrays.asList("a", "b", "c").sort((e1, e2) -> e1.compareTo(e2));

//        final String f = "!";
//        Arrays.asList("a", "b", "c").forEach(e -> System.out.println(e + f));

//        Arrays.asList("a", "b", "c").forEach(e -> System.out.println(e + "!"));

//        Arrays.asList("a","b","c").forEach(e -> System.out.println(e));
//        Arrays.asList("a","b","c").forEach();

//        Arrays.asList("a","b","c").forEach(e->{
//            System.out.println(e);
//            System.out.println(e);
//        });


    }

}
