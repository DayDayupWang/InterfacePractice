package 引用构造器;

public class StudentDemo {
    public static void main(String[] args) {
        // 一般方法
        // useStudentBuilder((String name, int age) -> {
        // return new Student(name, age);
        // });

        // lambda表达式
        // useStudentBuilder((name, age) -> new Student(name, age));

        // 方法引用，引用构造器
        useStudentBuilder(Student::new);

    }

    public static void useStudentBuilder(StudentBuilder sb) {
        Student s = sb.build("abd", 12);
        System.out.println(s.getName() + ", " + s.getAge());
    }
}
