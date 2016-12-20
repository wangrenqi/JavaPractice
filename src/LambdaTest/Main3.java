package LambdaTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mccree on 19/12/2016.
 */
public class Main3 {

    static Phone apple = new Phone("apple", 5000);
    static Phone xiaomi = new Phone("xiaomi", 1000);
    static Phone sumsang = new Phone("sumsang", 5000);
    static List<Phone> phoneList = new ArrayList<>();

    public static void main(String[] args) {
//        a();
//        b();
        c();
    }

    private static void c() {
        List<Phone> phoneList = new ArrayList<>();
        List<Phone> guochanPhoneList = new ArrayList<>();
        phoneList.add(new Phone("xiaomi", 1000));
        phoneList.add(new Phone("huawei", 1000));
        phoneList.add(new Phone("meizu", 1000));
        phoneList.add(new Phone("iphone", 5000));
        phoneList.add(new Phone("note7", 5000));

        guochanPhoneList = phoneList.stream()
                .filter((phone) -> phone.getName().equals("xiaomi"))
//                .filter((phone) -> phone.getName().equals("huawei"))
                .collect(Collectors.toList());
        guochanPhoneList.forEach((phone) -> System.out.println(phone.getName()));
        //output : xiaomi
    }

    private static void b() {
        phoneList.add(apple);
        phoneList.add(xiaomi);
        phoneList.add(sumsang);
        phoneList.stream()
                .filter((phone) -> phone.getName().equals("xiaomi"))
                .forEach((phone) -> System.out.println(phone.getName()));
        //output : xiaomi
    }

    private static void a() {
        phoneList.add(apple);
        phoneList.add(xiaomi);
        phoneList.forEach((phone) -> System.out.println(phone.getName()));
    }

}
