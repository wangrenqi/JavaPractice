package CallbackTest.Demo1;

/**
 * Created by Mccree on 24/11/2016.
 */
public class B implements OnCallback {


    @Override
    public void call(String string) {
        System.out.printf("call from CallbackTest.Demo1.B \n");
        System.out.println("string from outside ---> " + string);
    }
}
