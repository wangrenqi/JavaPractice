package BuilderMode.Demo1;

/**
 * Created by Mccree on 23/12/2016.
 */
public class Main {

    public static void main(String[] args) {

        Builder mA = new ABuilder();
        Builder mB = new BBuilder();

        Director director = new Director(mA);
        Food f = director.construct("paigu", "1", "2", "3", "4", "5");
        System.out.println(f.toString());

        Director director2 = new Director(mB);
        Food f2 = director2.construct("jiaozi", "22", "33", "44", "55", "66");
        System.out.println(f2.toString());

    }





}
