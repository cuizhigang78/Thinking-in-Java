package p6_access;

/**
 * @ClassName IceCream
 * @Author Maxwell
 * @Date 2022/2/20 21:54
 * @Description IceCream
 * @Version 1.0
 */
public class IceCream {
    public static void main(String[] args) {
        // Error: 'Sundae()' has private access in 'p6_access.Sundae'
        // Sundae x = new Sundae();
        Sundae x = Sundae.makeASundae();
    }
}

class Sundae {
    private Sundae() {

    }

    static Sundae makeASundae() {
        return new Sundae();
    }
}
