package p15_generics.c4_generic_method;

import java.util.*;

/**
 * create by 携山超 on 2020/6/30
 */
public class New {
    public static <K, V> Map<K, V> map() {
        return new HashMap<K, V>();
    }
    public static <T> List<T> list() {
        return new ArrayList<T>();
    }
    public static <T> Set<T> set() {
        return new HashSet<T>();
    }

    public static void main(String[] args) {
        Map<String, List<String>> sls = New.map();
        List<String> ls = New.list();
        Set<String> ss = New.set();
    }
}
