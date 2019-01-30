package demo;

public class ThreadDemo1 extends Thread {

    public static void main(String[] args) {
        // 定义线程名字
        Thread t1 = new Thread("t11");
        System.out.println(t1.getName());
        Thread t2 = new Thread("t22");
        System.out.println(t2.getName());
        // 获取线程存活状态
        System.out.println(t1.isAlive());
        t1.start();
        // start启动线程后，状态为true
        System.out.println(t1.isAlive());
    }
}
