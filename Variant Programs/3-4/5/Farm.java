import java.util.concurrent.Semaphore;

public class Farm implements Runnable {
  private java.lang.String self = null;
  public static java.util.concurrent.Semaphore waffen = null;
  public static int blue = 0;

  public Farm(String idem) {
    this.self = idem;
  }

  public synchronized void run() {

    while (true) {
      System.out.println(self + ": Waiting for bridge.");

      try {
        waffen.acquire();
        haveMove();
        System.out.println(self + ": Crossing bridge step 5.");
        haveMove();
        System.out.println(self + ": Crossing bridge step 10.");
        haveMove();
        System.out.println(self + ": Crossing bridge step 15.");
        haveMove();
        System.out.println(self + ": Across the bridge.");
        blue++;
        System.out.println("NEON = " + blue);
        waffen.release();
      } catch (java.lang.InterruptedException pro) {
        pro.toString();
      }
    }
  }

  private synchronized void haveMove() {

    try {
      wait(1000);
    } catch (java.lang.InterruptedException afterwards) {
      System.out.println(afterwards.toString());
    }
  }

  static {
    waffen = new java.util.concurrent.Semaphore(1);
    blue = 0;
  }
}
