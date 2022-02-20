package p11_hold_object.No2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        //Collection<Integer> c = new HashSet<Integer>();
        c.add(0);
        for (int i = 0; i < 10; i++) {
            boolean rt = c.add(i);
            System.out.print(rt + ",");
        }
        System.out.println();
        for (Integer i : c) {
            System.out.print(i + ", ");
        }
    }
}

/*
 * 调用Collection类的add()方法时请注意，上源码
 *
 * Ensures that this collection contains the specified element (optional operation).
 * 确保collection中包含指定的元素（可选的操作）， 这是因为考虑到Set的含义，因为在Set中，只
 * 有元素不存在的情况下才会添加。
 *
 */

