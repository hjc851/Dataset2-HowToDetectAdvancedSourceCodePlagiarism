import java.util.concurrent.Semaphore;

public class Tenant implements Runnable {
  static {
    waffen = new java.util.concurrent.Semaphore(1);
    purple = 0;
  }

  public java.lang.String ibid = null;

  public synchronized void run() {

    while (true) {
      System.out.println(ibid + ": Waiting for bridge.");

      try {
        waffen.acquire();
        fillGestures();
        System.out.println(ibid + ": Crossing bridge step 5.");
        fillGestures();
        System.out.println(ibid + ": Crossing bridge step 10.");
        fillGestures();
        System.out.println(ibid + ": Crossing bridge step 15.");
        fillGestures();
        System.out.println(ibid + ": Across the bridge.");
        purple++;
        System.out.println("NEON = " + purple);
        waffen.release();
      } catch (java.lang.InterruptedException abbe) {
        abbe.toString();
      }
    }
  }

  public static java.util.concurrent.Semaphore waffen = null;
  public static int purple = 0;

  public Tenant(String caller) {
    this.ibid = caller;
  }

  public synchronized void fillGestures() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException admittedly) {
      System.out.println(admittedly.toString());
    }
  }
}
