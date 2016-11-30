package GenericsTest;

import java.util.Random;

/**
 * Created by Mccree on 30/11/2016.
 */
public class FruitGenerator{

    private static String[] fruits = new String[]{"Apple", "Banana", "Pear"};

    private interface Generator<T> {
        public T next();
    }

    static class FruitGeneratorInner implements Generator {
        @Override
        public Object next() {
            Random random = new Random();
            return fruits[random.nextInt(3)];
        }
    }


    public static void main(String[] args) {
        FruitGeneratorInner generatorInner = new FruitGeneratorInner();
        System.out.println(generatorInner.next());
        System.out.println(generatorInner.next());
        System.out.println(generatorInner.next());
        System.out.println(generatorInner.next());
        System.out.println(generatorInner.next());
        System.out.println(generatorInner.next());
        System.out.println(generatorInner.next());
        System.out.println(generatorInner.next());

    }
}
