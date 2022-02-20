package p6_access;

import p6_access.dessert.Cookie;

/**
 * @ClassName Dinner
 * @Author Maxwell
 * @Date 2022/2/20 21:45
 * @Description Dinner
 * @Version 1.0
 */
public class Dinner {
    public static void main(String[] args) {
        Cookie x = new Cookie();
        // Error: 'bite()' is not public in 'p6_access.dessert.Cookie'. Cannot be accessed from outside package
        // x.bite();
    }
}
