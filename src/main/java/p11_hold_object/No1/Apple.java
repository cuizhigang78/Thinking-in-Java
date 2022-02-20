package p11_hold_object.No1;

public class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}
