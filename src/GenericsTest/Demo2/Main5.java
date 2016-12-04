package GenericsTest.Demo2;

/**
 * 类或者方法定义时，使用通配符 <T extends Number>
 * <T extends Number> 表示传入的类型必须是Number或者其子类型。
 * <p>
 * Created by Mccree on 04/12/2016.
 */
public class Main5 {


    public static void main(String[] args) {
        Test5 t5 = new Test5();
        t5.showClass(123);
        t5.showClass(123f);
        t5.showClass(123L);
//         t5.showClass("string"); 有错误 参数的类型，只能是 Number类型或者其子类

    }


    static class Test5 {
        public <T extends Number> void showClass(T t) {
            System.out.println(t.getClass());

        }
    }

}
