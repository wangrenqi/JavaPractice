package AnnotationTest.Demo3;

/**
 * Created by Mccree on 04/12/2016.
 */

import java.lang.reflect.Field;

/***********注解处理器***************/

public class FruitInfoUtil {

    public static void getFruitInfo(Class<?> clazz) {
        String strFruitName = " Fruit name is --> ";
        String strFruitColor = "Fruit Color is --> ";
        String strFruitProvider = "Fruit Provider is --> ";


        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = field.getAnnotation(FruitName.class);
                strFruitName = strFruitName + fruitName.value();
                System.out.println(strFruitName);
            } else if (field.isAnnotationPresent(FruitColor.class)) {
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                strFruitColor = strFruitColor + fruitColor.fruitColor().toString();
                System.out.println(strFruitColor);
            } else if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                strFruitProvider = strFruitProvider + "Provider id :: " + fruitProvider.id() + " Provider name :: " + fruitProvider.name() + " Provider address :: " + fruitProvider.address();
                System.out.println(strFruitProvider);

            }
        }
    }

}
