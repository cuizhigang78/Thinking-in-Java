package p11_hold_object.No4;

import java.util.*;

public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bos");
        map.put("dog", "Spot");
        return map;
    }

    public static void main(String[] args) {
        // ArrayList、LinkedList都按照插入的顺序保存元素，二者的区别在于执行某些操作的效率不同
        System.out.println("ArrayList=" + fill(new ArrayList<String>()));
        System.out.println("LinkedList=" + fill(new LinkedList<String>()));

        // HashSet是最快的获取元素方式，无序
        System.out.println("HashSet=" + fill(new HashSet<String>()));
        // TreeSet按照比较结果的升序保存对象
        System.out.println("TreeSet=" + fill(new TreeSet<String>()));
        // LinkedHashSet按照被添加的顺序保存对象
        System.out.println("LinkedHashSet=" + fill(new LinkedHashSet<String>()));

        // HashMap提供了最快的查找技术，无序
        System.out.println("HashMap=" + fill(new HashMap<String, String>()));
        // TreeMap按照比较结果的升序保存键
        System.out.println("TreeMap=" + fill(new TreeMap<String, String>()));
        // LinkedHashMap 按照插入顺序保存键，同时还保留了HashMap的查询速度
        System.out.println("LinkedHashMap=" + fill(new LinkedHashMap<String, String>()));
    }
}
