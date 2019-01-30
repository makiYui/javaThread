package demo;

public class IntSleep {

    public static void main(String[] args) {
        Runnable r = () -> {
          while (true) {
              System.out.println("hello");
              try {
                  Thread.sleep(100);
              } catch (InterruptedException e) {
                  e.printStackTrace();
                  System.out.println("interrupted");
                  break;
              }
          }
        };
        Thread t = new Thread(r);
        t.start();
        try {
            t.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
    }
}
