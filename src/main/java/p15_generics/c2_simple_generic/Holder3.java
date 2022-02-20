package p15_generics.c2_simple_generic;

/**
 * create by 携山超 on 2020/6/30
 */
public class Holder3<T> {
    private T a;
    public Holder3(T a) {
        this.a = a;
    }
    void set(T a) { this.a = a;}
    T get() {
        return a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> holder3 = new Holder3(new Automobile());
        Automobile a = holder3.get();  // No cast needed
        //holder3.set("Not a Automobile");  // Error
        //holder3.set(1);  // Error
    }
}
