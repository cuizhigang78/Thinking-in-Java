package p11_hold_object.No10;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics {
    public static void main(String[] args) {
        Random random = new Random(47);
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        // 此处自动包装机制将随机生成的int转换为HashMap可以使用的Integer引用（不能使用基本类型的容器）
        for (int i = 0; i < 10000; i++) {
            int r = random.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
    }
        System.out.println(m);
    }
}
