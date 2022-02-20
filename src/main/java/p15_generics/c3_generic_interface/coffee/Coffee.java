package p15_generics.c3_generic_interface.coffee;

/**
 * create by 携山超 on 2020/6/30
 */
public class Coffee {
    private static long counter = 0;
    private final long id = counter++;
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}