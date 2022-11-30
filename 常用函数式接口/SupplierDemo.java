package 常用函数式接口;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        // String s = getString(() -> {
        // return "afa";
        // });
        // 优化
        String s = getString(() -> "adaf");
        Integer i = getInteger(() -> 131);
        System.out.println(s);
        System.out.println(i);
    }

    private static Integer getInteger(Supplier<Integer> sup) {
        return sup.get();
    }

    private static String getString(Supplier<String> sup) {
        return sup.get();
    }
}
