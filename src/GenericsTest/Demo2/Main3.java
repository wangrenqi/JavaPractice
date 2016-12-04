package GenericsTest.Demo2;

/**
 * 有参数方法定义时，使用泛型
 * <p>
 * 有参数的泛型方法，类型的确定，是根据参数类型自动推导。
 * <p>
 * Created by Mccree on 04/12/2016.
 */
public class Main3 {

    public static void main(String[] args) {
        Test3 t3 = new Test3();
        t3.showClass("string");
        t3.showClass(12345);
    }


    public static class Test3{
        public <T> void showClass(T t) {
            System.out.println(t.getClass());

        }
    }

}
