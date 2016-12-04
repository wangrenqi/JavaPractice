package GenericsTest.Demo2;

import java.util.List;

/**
 * 使用通配符 ？
 *
 * 1、只能添加null。
 2、获取的值只能赋值给Object类型。
 因为通配符？表示该集合存储的元素类型未知，可以是任何类型。往集合中加入元素需要是一个未知元素类型的子类型，正因为该集合存储的元素类型未知，所以我们没法向该集合中添加任何元素。唯一的例外是null，因为null是所有类型的子类型，所以尽管元素类型不知道，但是null一定是它的子类型。

 *
 * Created by Mccree on 04/12/2016.
 */
public class Main6 {
//    public static void main (String[] args) throws java.lang.Exception
//    {
//        List<?> list = new ArrayList<Fruit>();
//        //list.add(new Food()); 编译错误
//        //list.add(new Fruit()); 编译错误
//        //list.add(new Apple()); 编译错误
//        list.add(null);
//        //Food food = list.get(0);
//        //Fruit fruit = list.get(0);
//        //Apple apple = list.get(0);
//        Object object = list.get(0);
//    }
}
