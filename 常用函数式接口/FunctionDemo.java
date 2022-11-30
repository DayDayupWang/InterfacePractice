package 常用函数式接口;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        // 操作一
        convert("100", s -> Integer.parseInt(s));
        // 操作二
        convert(100, i -> String.valueOf(i + 566));
        // 使用andThen的方式连续执行两个操作
        convert("100", s -> Integer.parseInt(s), i -> String.valueOf(i + 566));
    }

    // 定义一个方法，把一个字符串转换int类型，在控制台输出
    private static void convert(String s, Function<String, Integer> fun) {
        // Integer i = fun.apply(s);
        int i = fun.apply(s);
        System.out.println(i);
    }

    private static void convert(int i, Function<Integer, String> fun) {
        String s = fun.apply(i);
        System.out.println(s);
    }

    private static void convert(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        int i = fun1.apply(s);
        String ss = fun2.apply(i);
        System.out.println(ss);
    }
}
