package 引用构造器;

public interface StudentBuilder {
    Student build(String name, int age);
    // build是指在接口下声明了一个方法，方法的定义由lambda实现
}
