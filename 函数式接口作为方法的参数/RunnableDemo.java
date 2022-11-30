package 函数式接口作为方法的参数;

public class RunnableDemo {
    public static void main(String[] args) {
        // 主方法中调用startThread方法
        // 匿名内部类方式
        // startThread(new Runnable() {
        // @Override
        // public void run() {
        // System.out.println(Thread.currentThread().getName() + "线程启动了");
        // }
        // });
        //
        startThread(() -> System.out.println(Thread.currentThread().getName() + "线程启动了"));
    }

    private static void startThread(Runnable r) {
        // Thread t = new Thread();
        // t.start();
        new Thread().start();

    }
}
