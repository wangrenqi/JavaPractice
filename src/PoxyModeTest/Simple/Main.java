package PoxyModeTest.Simple;

/**
 * 静态代理
 *
 * 简单代理模式就是为一个实现类找一个代理人类，由这个代理人持有这个实现类并对外提供服务。
 * 使用的时候，只需要将RealSubject的实例对象交给代理类，再由代理类来对外提供服务
 * Created by Mccree on 01/12/2016.
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new ProxySubject(new RealSubject());
        subject.request();
    }
}
