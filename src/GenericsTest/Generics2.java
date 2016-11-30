package GenericsTest;

/**
 * Created by Mccree on 30/11/2016.
 */
public class Generics2 {

    //情况1 已经知道是什么类型
    public static class InterImpl implements Inter<String> {
        @Override
        public void show(String s) {
            System.out.println(s);
        }
    }

    //情况2 不知道是什么类型
    public static class InterImpl2<T> implements Inter<T> {
        @Override
        public void show(T t) {
            System.out.println(t);
        }
    }


    //泛型接口： 把泛型定义在接口上
    interface Inter<T> {
        public abstract void show(T t);
    }

    public static void main(String[] args) {
        //情况1 测试
        Inter<String> i = new InterImpl();
        i.show("hello");

        //情况2 测试
        Inter<String> i2 = new InterImpl2<>();
        i2.show("hello2");

        Inter<Integer> i3 = new InterImpl2<>();
        i3.show(10000);
    }
}

