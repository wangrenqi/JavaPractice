package GenericsTest.Demo1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Mccree on 30/11/2016.
 */
public class Generics {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
        test4();
    }

    //把泛型定义在方法上，可以传递任意类型参数
    private static void test4() {
        ObjectTool2 objectTool2 = new ObjectTool2();
        objectTool2.show("hello");
        objectTool2.show(100100100);
        objectTool2.show(true);
    }

    //泛型类测试
    private static void test3() {
        ObjectTool<String> objectTool = new ObjectTool<>();
        objectTool.setObj(new String("中国"));
        String s = objectTool.getObj();
        System.out.println(s);

        ObjectTool<Integer> objectToolInteger = new ObjectTool<>();
        objectToolInteger.setObj(new Integer(10000));
        Integer i = objectToolInteger.getObj();
        System.out.println(i);
    }

    private static void test2() {
        //可运行
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("generics");
        Iterator<String> ir = arrayList.iterator();
        while (ir.hasNext()) {
            System.out.println(ir.next());
        }
    }

    private static void test1() {
        //        Exception in thread "main" java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        //创建
        ArrayList array = new ArrayList();
        //添加元素
        array.add("hello");
        array.add("generics");
        array.add(10);
        //等价于：array.add(Integer.valueOf(10))
        Iterator it = array.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }
    }

    public static class ObjectTool<T> {
        private T obj;

        public T getObj() {
            return obj;
        }

        public void setObj(T obj) {
            this.obj = obj;
        }
    }

    public static class ObjectTool2{
        public <T> void show(T t) {
            System.out.println(t);
        }
    }

}


