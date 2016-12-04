package GenericsTest.Demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * 方法定义时，使用通配符 ？
 * <p>
 * 1、只能往集合中add null。
 * 2、因为集合中的类型不确定。
 * 因此，为了安全，转换为Object。
 * <p>
 *
 *
 *
 * Created by Mccree on 04/12/2016.
 */
public class Main4 {


    public static void main(String[] args) {
        Test4 t4 = new Test4();
        List<String> lisString = new ArrayList<>();
        lisString.add("hi");
        t4.show(lisString);

        List<Integer> listInt = new ArrayList<>();
        listInt.add(123);
        t4.show(listInt);

    }

    public static class Test4 {
        public void show(List<?> list) {
            list.add(null);
//            list.add(1111);  //wrong
//            1、只能往集合中add null。
//            2、因为集合中的类型不确定。因此，为了安全，转换为Object。
            for (Object object : list) {
                System.out.println(object);
            }
        }
    }


}
//        hi
//        null
//        123
//        null