package GenericsTest.Demo2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created by Mccree on 04/12/2016.
 */
public class Main7 {




//                  使用上界通配符 <? extends Fruit>
//            <p>
//             上界通配符，一般用于读取的场景。
//            * 1、为泛型指定的类型只能是Fruit类型或者其子类。
//            * 2、只能为其列表添加null。
//            * 3、get方法获取的值只能赋值给Fruit类或者其超类。
//            * <p>

//    public static void main (String[] args) throws java.lang.Exception
//    {
//        List<? extends Fruit> list = new ArrayList<Fruit>();
//        // List<? extends Fruit> listA = new ArrayList<Food>(); 编译错误。不能为父类。
//        List<? extends Fruit> listN = new ArrayList<Apple>();
//        listN.add(null);
//        //listN.add(123); 不能add
//        Fruit fruit = listN.get(0);
//        Food food = listN.get(0);
//        //Apple apple = listN.get(0); 编译错误。get获取的值，只能给父类
//        listN.remove(0);
//    }





//
//         使用下界通配符 <? super Fruit>
//              下界通配符，一般用于写入的场景。
//            1、为泛型指定的类型必须为Fruit，或者其超类。
//            2、可以为其列表添加任意Fruit类型，或者其子类。
//            3、get方法获取的类型，只能赋值给Object类型。

//    public static void main (String[] args) throws java.lang.Exception
//    {
//        List<? super Fruit> list = new ArrayList<Fruit>();
//        List<? super Fruit> listA = new ArrayList<Food>();
//        //List<? super Fruit> listN = new ArrayList<Apple>(); 编译错误，不能为子类
//        listA.add(new Fruit());
//        //listA.add(new Food()); 编译错误，不能为父类。
//        listA.add(new Apple());
//        Object object = listA.get(0);
//        //Fruit fruit = listA.get(0);编译错误。
//        //Food food = listA.get(0);编译错误。
//        //Apple apple = listA.get(0); 编译错误。
//    }





}
