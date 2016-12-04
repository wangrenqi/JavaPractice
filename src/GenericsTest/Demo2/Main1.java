package GenericsTest.Demo2;

/**
 * 类定义时，使用泛型
 *
 * 类名后面增加<T>，说明是泛型类。T可以视为类型的占位符。泛型类的代码就可以使用这个占位符T。
 *
 * Created by Mccree on 04/12/2016.
 */
public class Main1 {

    public static void main(String[] args) {
        Test1<String> tet1 = new Test1<>();
        tet1.setField("hello hello");
        System.out.println(tet1.getField());
    }


    static class Test1<T> {

        T field;

        public void setField(T field) {
            this.field = field;
        }

        public T getField() {
            return field;
        }
    }

}


