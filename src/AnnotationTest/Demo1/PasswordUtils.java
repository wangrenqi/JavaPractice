package AnnotationTest.Demo1;

import java.util.List;

/**
 * Created by Mccree on 04/12/2016.
 */

//Use Annotation
public class PasswordUtils {
    @UseCase(id = 47, description = "Password must contain at least one number")
    public static boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }

    @UseCase(id = 18)
    public static String encryptPassword(String password) {
        return new StringBuilder(password).toString();
    }

    @UseCase(id = 22, description = "new password cant equals previously uses one")
    public static boolean checkForNewPassword(List<String> list, String password) {
        return !list.contains(password);
    }

}

