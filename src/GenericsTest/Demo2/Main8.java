package GenericsTest.Demo2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Mccree on 04/12/2016.
 */
public class Main8 {

    //泛型类型是被所有调用共享的

    //    所有泛型类的实例都共享同一个运行时类，类型参数信息会在编译时被擦除。
// 因此考虑如下代码，虽然ArrayList<String>和ArrayList<Integer>类型参数不同，
// 但是他们都共享ArrayList类，所以结果会是true。
//
//    public static void main(String[] args) {
//        List<String> l1 = new ArrayList<>();
//        List<Integer> l2 = new ArrayList<>();
//        System.out.println(l1.getClass() == l2.getClass());
//
//    }


    //instanceof

    //    不能对确切的泛型类型使用instanceof操作
    //
//    public static void main(String[] args) {
//        Collection cs = new ArrayList<String>();
////    if (cs instanceof Collection<String>){}//compile error.如果改成instanceof Collection<?>则不会出错。
//        if (cs instanceof Collection<?>) {
//        }
//
//    }

//
//    泛型数组问题

//
//    public class Test {
//
//        public static void main (String[] args) throws java.lang.Exception
//        {
//            List<String>[] lsa = new ArrayList<String>[10]; //compile error.
//        }
//    }
//    不能创建一个确切泛型类型的数组。
//

//
//    public class Test {
//
//        public static void main (String[] args) throws java.lang.Exception
//        {
//            List<?>[] lsa = new ArrayList<?>[10]; // ok, array of unbounded wildcard type
//        }
//    }
//    能创建带通配符的泛型数组.
//



}
