package p11_hold_object.No1;

import java.util.ArrayList;

public class ApplesAndOrangesWithoutGenerics {
    // 这里的SuppressWarnings注解及其参数表示只有有关“不受检查的异常”的警告信息应该被抑制
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
            apples.add(new Orange());
        }
        for (Object apple : apples) {
            ((Apple) apple).id();
        }
    }
}
