package 常用函数式接口;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // boolean b1 = checkString("hello", (String s) -> {
        // return s.length() > 8;
        // });
        // 优化
        boolean b1 = checkString("hello", s -> s.length() > 8);
        boolean b2 = checkString("helloworld", s -> s.length() > 8);
        boolean b3 = checkString2("helloworld", s -> s.length() > 8, s -> s.length() > 10);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }

    private static boolean checkString(String s, Predicate<String> pre) {
        // return pre.test(s);
        // 做非操作
        // return !pre.test(s);
        // 或
        return pre.negate().test(s);
    }

    private static boolean checkString2(String s, Predicate<String> pre1, Predicate<String> pre2) {
        // boolean b1 = pre1.test(s);
        // boolean b2 = pre1.test(s);
        // return b1 && b2;

        // 优化手段 and()做短路与操作
        // return pre1.and(pre2).test(s);

        // 短路或操作
        return pre1.or(pre2).test(s);
    }
}
