package CallbackTest.Demo1;

/**
 * Created by Mccree on 24/11/2016.
 */
public class A {

    private OnCallback callbackListner;

    public void setCallbackListener(OnCallback callbackListner) {
        this.callbackListner = callbackListner;
    }

    public void doCallback(String s) {
        callbackListner.call(s);
    }


}
