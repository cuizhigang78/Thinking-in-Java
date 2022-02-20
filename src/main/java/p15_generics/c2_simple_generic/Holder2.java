package p15_generics.c2_simple_generic;

/**
 * create by 携山超 on 2020/6/30
 */
public class Holder2 {
    private Object a;
    public Holder2(Object a) {
        this.a = a;
    }
    void set(Object a) { this.a = a;}
    Object get() {
        return a;
    }

    public static void main(String[] args) {
        Holder2 holder2 = new Holder2(new Automobile());
        Automobile a = (Automobile) holder2.get();
        holder2.set("Not a Automobile");
        String s = (String) holder2.get();
        holder2.set(1);
        Integer x = (Integer) holder2.get();
    }
}
