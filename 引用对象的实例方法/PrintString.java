package 引用对象的实例方法;
public class PrintString {
    public void printUpper(String s) {
        // toUpperCase()把字符转化为大写
        String s1 = s.toUpperCase();
        System.out.println(s1);
    }
}
//1.创建对象