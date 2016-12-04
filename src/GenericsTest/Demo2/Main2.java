package GenericsTest.Demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 无参数方法定义时，使用泛型
 * <p>
 * 方法的返回值前面，修饰符后面增加<T>，表示为泛型方法。这样，就可以在方法的代码中使用T代表类型。
 * [[[[修饰符后面增加<T>，表示为泛型方法]]]]
 * 没有参数的泛型方法，类型的确定，是根据等号左边的类型推导泛型的最终类型。
 * Created by Mccree on 04/12/2016.
 */
public class Main2 {

    public static void main(String[] args) {
        Test2 t2 = new Test2();
        List<String> l2 = t2.newArrayList();
        l2.add("hello");
        l2.add("world");
        for (String s : l2) {
            System.out.println(s);
        }
    }


    public static class Test2{
        public <T> List<T> newArrayList(){
            return new ArrayList<T>();
        }
    }

}
