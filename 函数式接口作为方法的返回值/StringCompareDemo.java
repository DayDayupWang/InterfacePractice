package 函数式接口作为方法的返回值;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;

public class StringCompareDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("adfa");
        array.add("dadfaf");
        array.add("cda");
        array.add("qba");
        System.out.println("排序前" + array);
        Collections.sort(array, getComparator());
    }

    private static Comparator<String> getComparator() {
        // 匿名内部类的方式实现
        // return new Comparator<String>() {
        // @Override
        // public int compare(String s1, String s2) {
        // return s1.length()-s2.length();
        // }
        // };

        // Lambda方式实现
        return (s1, s2) -> s1.length() - s2.length();
    }
}
