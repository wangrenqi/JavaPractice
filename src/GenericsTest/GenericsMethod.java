package GenericsTest;

/**
 * Created by Mccree on 30/11/2016.
 */
public class GenericsMethod {


    public static void main(String[] args) {
        outPrint(1);
        outPrint("A");
        outPrint(1.1);
        outPrint(true);
        outPrinter("Vaa", 22222, 0.999999, false);
    }


    //可变参数
    public static <T> void outPrinter(T... args) {
        for (T t : args) {
            System.out.println(t);
        }
    }

    public static <T> void outPrint(T t) {
        System.out.println(t);
    }

}
