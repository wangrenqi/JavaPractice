package PoxyModeTest.Simple;

/**
 * Created by Mccree on 01/12/2016.
 */
public class ProxySubject implements Subject {

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("proxy subject start!");
        subject.request();
        System.out.println("proxy subject end!");
    }
}
