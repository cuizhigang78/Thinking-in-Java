package p15_generics.c3_generic_interface;

import p15_generics.c3_generic_interface.coffee.*;

import java.util.Iterator;
import java.util.Random;

/**
 * create by 携山超 on 2020/6/30
 */
public class CoffeeGenerator
        implements Generator<Coffee>, Iterator<Coffee> {
    private Class[] types = {Latte.class, Mocha.class, Cappuccino.class,
            Americano.class, Breve.class};
    private static Random rand = new Random(47);
    public CoffeeGenerator() { }
    // For iteration:
    private int size = 0;
    public CoffeeGenerator(int size) {
        this.size = size;
    }
    @Override
    public Coffee next() {
        try {
            return (Coffee) types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;
        @Override
        public boolean hasNext() {
            return count > 0;
        }
        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }
        @Override
        public void remove() { throw new UnsupportedOperationException(); }
    }
    public Iterator<Coffee> iterator() { return new CoffeeIterator(); }
    @Override
    public boolean hasNext() { return false; }

    @Override
    public void remove() { }

    public static void main(String[] args) {
        CoffeeGenerator generator = new CoffeeGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(generator.next());
        }
    }
}
