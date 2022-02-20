package p6_access;

import p6_access.dessert.Cookie;

/**
 * @ClassName ChocolateChip
 * @Author Maxwell
 * @Date 2022/2/20 22:00
 * @Description ChocolateChip
 * @Version 1.0
 */
public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    public void chomp() {
        // Error: 'bite()' is not public in 'p6_access.dessert.Cookie'. Cannot be accessed from outside package
        bite();
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}
