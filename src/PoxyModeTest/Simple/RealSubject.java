package PoxyModeTest.Simple;

/**
 * Created by Mccree on 01/12/2016.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("Real subject..");
    }
}
