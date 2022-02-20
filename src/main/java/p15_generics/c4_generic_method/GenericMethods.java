package p15_generics.c4_generic_method;

import p15_generics.c3_generic_interface.coffee.Coffee;

/**
 * create by 携山超 on 2020/6/30
 */
public class GenericMethods {
    public <T> void f(T x) { System.out.println(x.getClass().getName()); }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");  // java.lang.String
        gm.f(1);  // java.lang.Integer
        gm.f(1.0);  // java.lang.Double
        gm.f(1.0F);  // java.lang.Float
        gm.f('c');  // java.lang.Character
        gm.f(gm);  // p15_generics.c4_generic_method.GenericMethods
    }
}
